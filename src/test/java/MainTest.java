import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;


import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void getWordCount() {
        String document = "this is software engineering project";
        Map<String, Integer> expected = new HashMap<>();
        expected.put("this", 1);
        expected.put("is", 1);
        expected.put("software", 1);
        expected.put("engineering", 1);
        expected.put("project", 1);
        Map<String, Integer> actual = WordCount.getWordFrequency(document);
        assertEquals(expected, actual);
    }
    @Test
    public void testGetLineCount() {
        String document = "I am doing software engineering\nThis is another line";
        int expected = 2;

        int result = WordCount.getLineCount(document);

        assertEquals(expected, result);
    }

    @Test
    public void testGetCharCount() {
        String document = "I am doing software engineering";
        int expected = 31;

        int result = WordCount.getCharCount(document);

        assertEquals(expected, result);
    }
    @Test
    void emptyStringTestCase() {
        String document = "";
        Map<String, Integer> expected = new HashMap<>();

        Map<String, Integer> actual = WordCount.getWordFrequency(document);
        assertEquals(expected, actual);
    }

    @Test
    void singleStringTestCase() {
        String document = "Software";
        Map<String, Integer> expected = new HashMap<>();
        expected.put("Software", 1);

        Map<String, Integer> actual = WordCount.getWordFrequency(document);
        assertEquals(expected, actual);
    }
    @Test
    void RepeatedWordCounter() {
        String sentence = "the quick brown fox jumps over the lazy dog";
        String[] words = sentence.split(" ");

        Map<String, Integer> expectedCounts = new HashMap<>();
        expectedCounts.put("the", 2);
        expectedCounts.put("quick", 1);
        expectedCounts.put("brown", 1);
        expectedCounts.put("fox", 1);
        expectedCounts.put("jumps", 1);
        expectedCounts.put("over", 1);
        expectedCounts.put("lazy", 1);
        expectedCounts.put("dog", 1);

        Map<String, Integer> actualCounts = new HashMap<>();
        for (String word : words) {
            if (actualCounts.containsKey(word)) {
                int count = actualCounts.get(word);
                actualCounts.put(word, count + 1);
            } else {
                actualCounts.put(word, 1);
            }
        }

        assertEquals(expectedCounts, actualCounts);
    }
    @Test
    public void Separators() {
        String sentence = "the-quick_brown,fox:jumps over the_lazy-dog";
        String[] words = sentence.split("[\\W_]+");

        Map<String, Integer> expectedCounts = new HashMap<>();
        expectedCounts.put("the", 2);
        expectedCounts.put("quick", 1);
        expectedCounts.put("brown", 1);
        expectedCounts.put("fox", 1);
        expectedCounts.put("jumps", 1);
        expectedCounts.put("over", 1);
        expectedCounts.put("lazy", 1);
        expectedCounts.put("dog", 1);

        Map<String, Integer> actualCounts = new HashMap<>();
        for (String word : words) {
            if (actualCounts.containsKey(word)) {
                int count = actualCounts.get(word);
                actualCounts.put(word, count + 1);
            } else {
                actualCounts.put(word, 1);
            }
        }

        assertEquals(expectedCounts, actualCounts);
    }
    @Test
    public void VariablesAndNumerics() {
        String sentence = "x = 5 + y; y = x * 2";
        String[] words = sentence.split("\\W+");

        Map<String, Integer> expectedCounts = new HashMap<>();
        expectedCounts.put("x", 2);
        expectedCounts.put("y", 2);
        expectedCounts.put("5", 1);
        expectedCounts.put("2", 1);

        Map<String, Integer> actualCounts = new HashMap<>();
        for (String word : words) {
            if (actualCounts.containsKey(word)) {
                int count = actualCounts.get(word);
                actualCounts.put(word, count + 1);
            } else {
                actualCounts.put(word, 1);
            }
        }

        assertEquals(expectedCounts, actualCounts);
    }
   

    @Test
    void MultipleSpace() {
        String sentence = "the quick    brown fox  jumps over the   lazy dog";
        String[] words = sentence.split("\\s+");

        Map<String, Integer> expectedCounts = new HashMap<>();
        expectedCounts.put("the", 2);
        expectedCounts.put("quick", 1);
        expectedCounts.put("brown", 1);
        expectedCounts.put("fox", 1);
        expectedCounts.put("jumps", 1);
        expectedCounts.put("over", 1);
        expectedCounts.put("lazy", 1);
        expectedCounts.put("dog", 1);

        Map<String, Integer> actualCounts = new HashMap<>();
        for (String word : words) {
            if (actualCounts.containsKey(word)) {
                int count = actualCounts.get(word);
                actualCounts.put(word, count + 1);
            } else {
                actualCounts.put(word, 1);
            }
        }

        assertEquals(expectedCounts, actualCounts);
    }
}