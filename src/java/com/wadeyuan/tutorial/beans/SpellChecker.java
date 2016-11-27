package com.wadeyuan.tutorial.beans;

/**
 * Created by wadey on 11/27/2016.
 */
public class SpellChecker {

    private String locale;

    public SpellChecker() {
        System.out.println("Initializing: " + SpellChecker.class.getName());
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public void checkSpelling(String s) {
        System.out.println("Checking spelling of input string: " + s);
        System.out.println("Locale: " + locale);
    }

    @Override
    public String toString() {
        return "SpellChecker{" +
                "locale='" + locale + '\'' +
                '}';
    }
}
