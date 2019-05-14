package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Sample text",(text)-> text.toUpperCase());
        poemBeautifier.beautify("Sample text",(text)-> "ABC " + text + " ABC");
        poemBeautifier.beautify("Sample text",(text)-> text.replace('a','@'));
        poemBeautifier.beautify("Sample text",(text)-> text.concat(" to beautify"));
    }
}
