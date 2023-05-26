# Lab 9: Scrabble Hand Calculator

## Learning Outcomes
 - Have a thorough understanding of commonly used library data structures
 - Use data structures in software design and implementation
 - Use the `Collection<E>` and `Set<E>` interfaces as described in the Java
 - Collections Framework
 - Write and interpret code using the ArrayList , HashSet , LinkedList , and TreeSet data structures
 - Override the `Object.hashCode()` and `Object.equals()` methods to use an object with hashing-based collections
 - Understand and apply recursion in algorithm development

## Overview
In this lab, you will write a program that calculates the score of a hand in a game of Scrabble. The program will read in a file containing a list of words and allow the user to input a hand of letters. It will calculate then the highest possible score for the hand. The program will also print out the word that achieves the highest score.

You are required to implement the recursive algorithm, `recursiveSearch()` method in the `Hand` class (more details later). This method implements the core recursive algorithm that generates all possible letter combinations in the hand and finds all the letter combinations that are found in a dictionary (specified by a file containing a list of words).

## Implementation
###  `Hand` class
You must implement a class called `Hand` that will hold the contents of the hand. Each `Hand` object must maintain the following data:
 - A `String` object that holds the letters in the hand
 - An `ArrayList` object that holds the words that can be formed from the letters in the hand
 - An `ArrayList` object that holds the scores of the words that can be formed from the letters in the hand

The `Hand` class must implement the following methods:
 - `Hand(Collection<String> emptyDictionary)`: Constructs a hand object that makes use of the collection to determine if a letter sequence is found in the word list.
 - `loadDictionary(Path path)`: Loads a collection of correctly spelled words into the dictionary data structure.
 - `loadHand(String hand)`: Loads a string of letters into the hand data structure.
 - `recursiveSearch(String word, String letters)`: A recursive method that generates all possible letter combinations in the hand and finds all the letter combinations that are found in a dictionary (specified by a file containing a list of words).