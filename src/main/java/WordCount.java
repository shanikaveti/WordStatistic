import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String document = args[0];
//        String document = "I am doing software engineering";
        Map<String, Integer> wordFrequency = getWordFrequency(document);
        int lineCount = getLineCount(document);
        int charCount = getCharCount(document);
        System.out.println("Word frequency:");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("Line count: " + lineCount);
        System.out.println("Character count: " + charCount);
    }

    public static Map<String, Integer> getWordFrequency(String document) {
        Map<String, Integer> frequency = new HashMap<>();
        String[] words = document.split("[\\s\\t\\n]+");
        for (String word : words) {
            if (!word.isEmpty()) {
                frequency.put(word, frequency.getOrDefault(word, 0) + 1);
            }
        }
        return frequency;
    }

    public static int getLineCount(String document) {
        String[] lines = document.split("\\r?\\n");
        return lines.length;
    }

    public static int getCharCount(String document) {
        return document.length();
    }
}
