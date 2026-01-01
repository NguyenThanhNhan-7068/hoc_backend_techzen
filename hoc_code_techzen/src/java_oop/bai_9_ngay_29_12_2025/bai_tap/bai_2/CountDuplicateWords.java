package java_oop.bai_9_ngay_29_12_2025.bai_tap.bai_2;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateWords {
    public static void main(String[] args) {
        String text = "dau nam dau thang van phai lam bai tap.";
        countDuplicateWords(text);

    }

    public static void countDuplicateWords(String text) {
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = text.split(" ");

        for (String word : words) {
            word = word.toLowerCase();
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        for (String word : wordCount.keySet()) {
            System.out.println(word + ": " + wordCount.get(word));
        }
    }
}
