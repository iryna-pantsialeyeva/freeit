package task5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* Написать частотный словарь - посчитать сколько раз каждое слово встречается в предложении и
вывести результат в консоль*/

public class FrequencyDictionary {
    public static void main(String[] args) {
        String text = "мама мыла раму раму мыла мама";

        String[] wordArray = text.split(" ");

        Set<String> wordSet = new HashSet<>();

        // 1. из массива wordArray создаем список значений при пом. метода asList класса Array
        // 2. сохраняем наш список в HashSet при пом. метода addAll
        // 3. при этом HashSet обеспечивает уникальность записываемых значений (перезаписывает повторяющиеся значения)
        wordSet.addAll(Arrays.asList(wordArray));

        for (String word : wordSet) {
            int counter = 0;
            for (int i = 0; i < wordArray.length; i++) {
                if (word.equals(wordArray[i])) {
                    counter++;
                }
            }
            System.out.println("Word " + word + " is repeated " + counter + " time(s).");
        }
    }
}
