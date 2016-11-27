package com.wadeyuan.tutorial.beans;

import org.omg.CORBA.Object;

import java.util.List;
import java.util.Map;

/**
 * Created by wadey on 11/27/2016.
 */
public class SpellChecker {

    private String locale;
    private List<String> dictionaries; // List of *.dic file locations

    public SpellChecker(String locale) {
        this.locale = locale;
        System.out.println("Initializing: " + this.toString());
    }

    public void setDictionaries(List<String> dictionaries) {
        this.dictionaries = dictionaries;
    }

    public void checkSpelling(String s) {
        System.out.println("Checking spelling of input string: " + s);
        System.out.println("SpellCheler=" + toString());
    }

    @Override
    public String toString() {
        return "SpellChecker{" +
                "locale='" + locale + '\'' +
                ", dictionaries=" + dictionaries +
                '}';
    }
}
