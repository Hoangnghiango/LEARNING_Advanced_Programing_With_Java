package Lesson11_Stack_Queue.WordCounter_TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class CountWord02 {

        public static void main(String[] args) {
            String str = "this is a string of words and more words";

            TreeMap<String, Integer> wordCount = new TreeMap<>();

            String[] words = str.split(" ");

            for (String word : words) {
                String key = word.toLowerCase();
                if (wordCount.containsKey(key)) {
                    wordCount.put(key, wordCount.get(key) + 1);
                } else {
                    wordCount.put(key, 1);
                }
            }

            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

