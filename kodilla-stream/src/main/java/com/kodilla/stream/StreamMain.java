package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Example Text1", text -> "ABC" + text + "ABC");
        poemBeautifier.beautify("Example Text2", text -> text.toUpperCase());
        poemBeautifier.beautify("Example Text3", text -> text.toLowerCase());
        poemBeautifier.beautify("Example Text3", text -> text.substring(2,7));
    }
}