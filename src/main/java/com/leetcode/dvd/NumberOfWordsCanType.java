package com.leetcode.dvd;

public class NumberOfWordsCanType {

    public static void main(String[] args) {
        String text = "abc de";
        String brokenLetters = "";
        System.out.println(canBeTypedWords(text,brokenLetters));
    }

    public static int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        String[] letters = brokenLetters.split("");

        int numberOfWords = words.length;
        for (String word : words) {
            int count = 0;
            for (String letter : letters) {
                if (!letter.isBlank() && word.contains(letter)){
                    count++;
                }
            }
            if (count>0){
                numberOfWords--;
            }
        }
        return numberOfWords;
    }
}
