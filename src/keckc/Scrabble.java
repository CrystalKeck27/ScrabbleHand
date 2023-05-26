package keckc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Scrabble {
    public static final int[] POINTS = {
            1, 3, 3, 2, 1, 4, 2, 4, 1, 8,
            5, 1, 3, 1, 1, 3, 10, 1, 1, 1,
            1, 4, 4, 8, 4, 10
    };

    public static final Set<String> DICTIONARY = loadDictionary();

    private static Set<String> loadDictionary() {
        HashSet<String> dictionary = new HashSet<>(100_000);

        try (Scanner scanner = new Scanner(new File("words.txt"))) {
            while (scanner.hasNextLine()) {
                String word = scanner.nextLine();
                dictionary.add(word);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error reading words.txt: " + e.getMessage());
            System.exit(1);
        }

        return dictionary;
    }

    public static int score(String word) {
        int score = 0;
        for (char c : word.toCharArray()) {
            score += POINTS[c - 'A'];
        }
        return score;
    }

    public static void load() {
    }
}
