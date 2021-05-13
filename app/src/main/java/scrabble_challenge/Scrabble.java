package scrabble_challenge;

public class Scrabble {
    private String word;
    private int[] wordValue = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};


    Scrabble(String word){
        if(this.isNullCheck(word)){
            this.word = word.toLowerCase();
        }else{
            this.word = "";
        }
    }

    public String getWord(){
        return this.word;
    }

    public int wordScore(){
        int score = 0;
        if(this.whitespaceCheck()){
            for(int i = 0; i<word.length(); i++){
                score += wordValue[word.charAt(i) - 97];
            }
        }
        return score;
    }

    private boolean whitespaceCheck(){
        return !(this.word.isBlank());
    }

    private boolean isNullCheck(String word){
        return !(word == null);
    }
}
