package readingdifficulty;

public class Main {

    public static void main(String[] args) {

        Sentence sentence = new Sentence();

        String[] temp = Sentence.splitSentence(sentence.inputSentence());

       for(int i=0; i<temp.length;i++) {
            System.out.println(temp[i]);
        }

       int sentenceDifficulty = sentence.countDifficultSentence(temp);
       System.out.println("\nSentence reading difficulty is: " + sentenceDifficulty);


       /* Word w = new Word();
        String ex = "vaschoeufreittginalloiefchch";
        System.out.println(w.isVowelSequence(ex));
        System.out.println(w.hasOccurrences(ex));
        System.out.println(w.isDoubleConsonant(ex));
        System.out.println(w.countDifficultStrings(ex));*/

    }

}
