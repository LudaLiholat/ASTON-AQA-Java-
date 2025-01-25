import java.util.*;

public class WordCounter {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "orange", "banana", "grape", "apple", "peach", "grape", "banana", "peach", "pear", "orange", "grape", "lemon", "lemon", "melon", "watermelon", "melon"};

        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        System.out.println("Уникальные слова: " + uniqueWords);

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Количество вхождений каждого слова: " + wordCount);
    }
}