package com.wadeyuan.tutorial.beans;

/**
 * Created by wadey on 11/27/2016.
 */
public class SpellChecker {

    public SpellChecker() {
        System.out.println("Initializing: " + SpellChecker.class.getName());
    }

    public void checkSpelling(String s) {
        System.out.println("Checking spelling of input string: " + s);
    }
}
