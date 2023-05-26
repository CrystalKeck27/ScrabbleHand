package keckc;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Hand {
    private char[] hand = new char[7];

    public Hand() {
        for (int i = 0; i < 7; i++) {
            hand[i] = (char) ('A' + Math.random() * 26);
        }
    }

    public String[] listValidWords() {
        HashSet<String> words = new HashSet<>();
        LinkedList<Character> hand = new LinkedList<>();
        for (char c : this.hand) {
            hand.add(c);
        }

        listValidWords("", hand, Scrabble.DICTIONARY, words);
        return words.toArray(new String[0]);
    }

    private static void listValidWords(String word, LinkedList<Character> hand, Set<String> dictionary, Set<String> words) {
        if (hand.isEmpty()) {
            return;
        }

        for (int i = 0; i < hand.size(); i++) {
            char c = hand.remove(0);
            word += String.valueOf(c);
            if (dictionary.contains(word)) {
                words.add(word);
            }
            listValidWords(word, hand, dictionary, words);
            word = word.substring(0, word.length() - 1);
            hand.add(c);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (char c : hand) {
            sb.append(c);
        }
        return sb.toString();
    }
}
