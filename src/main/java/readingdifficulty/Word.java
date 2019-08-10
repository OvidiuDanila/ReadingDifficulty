package readingdifficulty;

public class Word {

    private String word;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    private boolean isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c=='y' || c == 'Y');
    }

    private int isVowelSequence(String word) {
        int difficulty = 0;
        if (word.length() > 3) {
            for (int i = 0; i < word.length() - 2; i++) {
                if (isVowel(word.charAt(i)) && isVowel(word.charAt(i+1)) && isVowel(word.charAt(i+2))) {
                    difficulty++;
                }
            }
        }
        return difficulty;
    }

    /*public int hasOccurrences(String word) {
        int difficulty = 0;
        if (word.length() > 2) {
            if (word.contains("ch") || word.contains("ei") || word.contains("ie")) {
                    difficulty++;
            }
        }
        return difficulty;
    }*/

    private int hasOccurrences(String word) {
        int difficulty = 0;
        String[] substring = {"ch","ie","ei"};
        int i=0;
        int j=0;
        for (i=0; i<substring.length;i++) {
            while ((j = word.indexOf(substring[i], j)) != -1) {
                difficulty++;
                j++;
            }
        }
    return difficulty;

    }

    private int isDoubleConsonant(String word) {
        int difficulty = 0;
        if (word.length() > 2) {
            for (int i = 0; i < word.length() - 1; i++) {
                if ((word.charAt(i) == word.charAt(i+1)) && (! isVowel(word.charAt(i)))) {
                    difficulty++;
                }
            }
        }
        return difficulty;
    }

    public int countDifficultStrings(String word) {
        int diff = isVowelSequence(word) + hasOccurrences(word) + isDoubleConsonant(word);
        return diff;
    }

}
