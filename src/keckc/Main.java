package keckc;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Hand hand = new Hand();
        System.out.println(hand);
        Scrabble.load();
        String[] words = hand.listValidWords();
        Arrays.sort(words, (a, b) -> Scrabble.score(b) - Scrabble.score(a));
        for (String word : words) {
            System.out.println(Scrabble.score(word) + " " + word);
        }
    }
}
