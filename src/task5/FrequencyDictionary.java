package task5;

/* Написать частотный словарь - посчитать сколько раз каждое слово встречается в предложении и
вывести результат в консоль*/

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class FrequencyDictionary {
    public static void main(String[] args) {
        String text = "Мама, мыла      раму! Раму мыЛа мАмА . Мылом мыла Мама?  ";
        Pattern pattern = Pattern.compile("\\s*[\\s,!.?]\\s*");
        String[] words = pattern.split(text.toLowerCase());
        String[] dictionary = new String[words.length];
        int wordCounter = 0;

        for (int i = 0; i < words.length; i++) {
            boolean isConsist = false;

            for (String wordFromDictionary : dictionary) {
                if (words[i].equals(wordFromDictionary)) {
                    isConsist = true;
                    break;
                }
            }

            if (!isConsist) {
                dictionary[i] = words[i];
            }
        }

        for (String wordFromDictionary : dictionary) {
            if (wordFromDictionary != null) {
                Pattern pattern1 = Pattern.compile(wordFromDictionary);
                Matcher matcher = pattern1.matcher(text.toLowerCase());

                while (matcher.find()) {
                    wordCounter++;
                }

                System.out.println(wordFromDictionary + " - " + wordCounter + " times");
                wordCounter = 0;
            }
        }
    }
}