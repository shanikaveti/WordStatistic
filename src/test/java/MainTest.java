import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {



    @Test
    public void testReplaceWordWithPartialMatch() {
        String text = "The category is not important";
        String patternWord = "cat";
        String replacementWord = "dog";
        String expected = "The category is not important";
        String result = text.replaceAll("\\b" + patternWord + "\\b", replacementWord);
        assertEquals(expected, result);
    }
    @Test
    public void testReplaceSingleWord() {
        // Test replacing a word with one occurrence
        String text = "The quick brown fox jumps over the lazy dog.";
        String pattern = "quick";
        String replacement = "slow";
        String expected = "The slow brown fox jumps over the lazy dog.";
        assertEquals(expected, text.replaceAll("\\b" + pattern + "\\b", replacement));
    }
    @Test
    public void testReplaceMultipleWord() {
        String text = "I love to eat apples and apples are delicious.";
        String pattern = "apples";
        String replacement = "oranges";
        String expected = "I love to eat oranges and oranges are delicious.";
        assertEquals(expected, text.replaceAll("\\b" + pattern + "\\b", replacement));
    }
    @Test
    public void testReplaceWordAsAPartOfAnotherWord() {
        String text = "The carriage will depart from platform 9 3/4 at 11:00am.";
        String pattern = "car";
        String replacement = "bus";
        String expected = "The carriage will depart from platform 9 3/4 at 11:00am.";
        assertEquals(expected, text.replaceAll("\\b" + pattern + "\\b", replacement));
    }

    @Test
    public void testReplaceEmptyString() {
        String text = "I am happy";
        String pattern = "happy";
        String replacement = "";
        String expected = "I am ";
        assertEquals(expected, text.replaceAll("\\b" + pattern + "\\b", replacement));
    }
    @Test
    public void testReplaceNonExistentWord() {
        String text = "The sun is shining.";
        String pattern = "rain";
        String replacement = "snow";
        String expected = "The sun is shining.";
        assertEquals(expected, text.replaceAll("\\b" + pattern + "\\b", replacement));
    }

    @Test
    public void testCapitalized() {
        String text = "I like to eat apples and APPLES are delicious.";
        String pattern = "apples";
        String replacement = "oranges";
        String expected = "I like to eat oranges and APPLES are delicious.";
        assertEquals(expected, text.replaceAll("\\b" + pattern + "\\b", replacement));
    }
}