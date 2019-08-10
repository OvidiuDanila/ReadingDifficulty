package readingdifficulty;

import java.util.Scanner;

public class Sentence {

    private Word[] words;
    //private String sentence;

    private Word w = new Word();


    public String inputSentence() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write sentence: ");
        String sentence = scanner.nextLine();
        System.out.println("Your sentence is: " + sentence);
        return sentence;
    }

    public static String[] splitSentence(String sentence) {
        String[] result = sentence.split("\\s+");
        return result;
    }

    public int countDifficultSentence(String[] words) {

        int diff = 0;
        for (int i=0; i<words.length; i++) {
            if (w.countDifficultStrings(words[i]) >0 ) {
                diff = diff + w.countDifficultStrings(words[i]);
                if (i>=2) {
                    if ( ( w.countDifficultStrings(words[i]) >0) && (w.countDifficultStrings(words[i-1]) >0) ) {
                        diff = diff + 2;
                    }
                    if ( (w.countDifficultStrings(words[i]) >0) && (w.countDifficultStrings(words[i-2]) >0) ) {
                        diff = diff + 1;
                    }
                }
            }
        }
        return diff;
    }

}
