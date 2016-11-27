package com.wadeyuan.tutorial.beans;

/**
 * Created by wadey on 11/27/2016.
 */
public class TextEditor {

    private SpellChecker spellChecker;

    public TextEditor() {
        System.out.println("Initializing: " + TextEditor.class.getName());
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
        System.out.println("Injecting spellChecker for TextEditor...");
    }

    public void input(String input) {
        spellChecker.checkSpelling(input);
    }

    @Override
    public String toString() {
        return "TextEditor{" +
                "spellChecker=" + spellChecker +
                '}';
    }
}
