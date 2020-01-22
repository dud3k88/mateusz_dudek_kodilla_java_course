package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
        public static void main(String[] args) {
            System.out.println("Welcome to module 7 - Stream");

            PoemBeautifier poemBeautifier = new PoemBeautifier();
            poemBeautifier.beautify("Sample Text", String::toUpperCase);
            poemBeautifier.beautify("Sample Text", txt -> "ABC " + txt + " ABC");
            poemBeautifier.beautify("Sample Text", String::toLowerCase);
            poemBeautifier.beautify("Sample Text", txt -> txt + "!!!!!!!!!!!!!!");

        }
}
