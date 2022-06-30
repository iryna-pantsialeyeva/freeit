package task6;

/* Написать программу, которая будет хранить текст по предложениям
и для каждого предложения составить частотный словарь*/

public class SentenceFrequencyDictionary {
    public static void main(String[] args) {

        String text = "Я буду маліцца і сэрцам, і думамі, Распетаю буду маліцца душой. Каб чорныя долі з " +
                "мяцеліцаў шумамі Ўжо больш не шалелі над роднай зямлёй. Я буду маліцца да яснага сонейка. " +
                "Няшчасных зімой саграваць сірацін. Прыветна па збожных гуляючы гонейках, " +
                "Часцей заглядаці да цёмных хацін.";

        String[] sentence = textToSentenceParser(text.toLowerCase());

        for (int i = 0; i < sentence.length; i++) {
            String[] word = sentenceToWordParser(sentence[i]);
            String[] dictionary = new String[word.length];
            int[] counter = new int[word.length];


            for (int j = 0; j < word.length; j++) {
                boolean isConsist = false;
                int count = 1;

                for (int k = j + 1; k < word.length; k++) {
                    if (word[j].equals(word[k])) {
                        count++;
                    }
                }

                for (int k = 0; k < dictionary.length; k++) {
                    if (word[j].equals(dictionary[k])) {
                        isConsist = true;
                    }
                }

                if (!isConsist) {
                    dictionary[j] = word[j];
                    counter[j] = count;

                }
            }

            for (int j = 0; j < counter.length; j++) {
                if (counter[j] != 0) {
                    System.out.println("The amount of " + "\"" + dictionary[j] + "\"" + " is equal to " + counter[j]);
                }
            }
            System.out.println("************************************************");
        }
    }

    static String[] textToSentenceParser(String text) {
        String[] sentence = text.split("[.!?]");
        return sentence;
    }

    static String[] sentenceToWordParser(String sentence) {

        String[] word = sentence.trim().split(",\\s|\\s");
        return word;
    }
}
