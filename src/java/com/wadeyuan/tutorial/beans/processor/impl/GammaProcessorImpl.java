package com.wadeyuan.tutorial.beans.processor.impl;

import com.wadeyuan.tutorial.beans.processor.GammaProcessor;

/**
 * Created by wadey on 12/27/2016.
 */
public class GammaProcessorImpl implements GammaProcessor {
    @Override
    public void processGamma() {
        System.out.println("Gamma processing task");
    }
}
