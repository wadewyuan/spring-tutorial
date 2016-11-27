package com.wadeyuan.tutorial.beans;

/**
 * Created by wadey on 11/27/2016.
 */
public class Configuration {
    private boolean spellingCheckEnabled;

    public void setSpellingCheckEnabled(boolean spellingCheckEnabled) {
        this.spellingCheckEnabled = spellingCheckEnabled;
    }

    public boolean isSpellingCheckEnabled() {
        return spellingCheckEnabled;
    }

    @Override
    public String toString() {
        return "Configuration{" +
                "spellingCheckEnabled=" + spellingCheckEnabled +
                '}';
    }
}
