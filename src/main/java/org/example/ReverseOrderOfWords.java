package org.example;

public class ReverseOrderOfWords {

    public String reverseTheOrderOfWords(String sentence) {
        if (sentence == null) {
            return null;
        }

        StringBuilder output = new StringBuilder();
        String[] words = sentence.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            output.append(words[i]);
            output.append(" ");
        }

        return output.toString().trim();
    }

}
