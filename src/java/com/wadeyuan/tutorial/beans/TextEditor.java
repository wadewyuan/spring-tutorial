package com.wadeyuan.tutorial.beans;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by wadey on 11/27/2016.
 */
public class TextEditor {

    private SpellChecker spellChecker;
    @Autowired
    private Configuration configuration;

    public TextEditor() {
        System.out.println("Initializing: " + this.toString());
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
        System.out.println("Injecting spellChecker: " + spellChecker);
    }

    /**
     * Autowire will not call the setter method to inject dependency, TODO: Review & debug the code
     * @param configuration
     */
    public void setConfiguration(Configuration configuration) {
        System.out.println("Injecting configuration: " + configuration);
        this.configuration = configuration;
    }

    public void input(String input) {
        System.out.println("Input of editor: " + input);
        if(configuration.isSpellingCheckEnabled()) {
            spellChecker.checkSpelling(input);
        }
    }

    @Override
    public String toString() {
        return "TextEditor{" +
                "spellChecker=" + spellChecker +
                ", configuration=" + configuration +
                '}';
    }
}
