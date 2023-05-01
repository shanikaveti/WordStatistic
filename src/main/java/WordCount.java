import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the text:");
        String text = scanner.nextLine();

        System.out.println("Enter the word to replace:");
        String pattern = scanner.nextLine();

        System.out.println("Enter the replacement word:");
        String replacement = scanner.nextLine();

        // Replace all occurrences of the pattern word with the replacement word
        text = text.replaceAll("\\b" + pattern + "\\b", replacement);

        System.out.println("New String: " + text);
    }
}