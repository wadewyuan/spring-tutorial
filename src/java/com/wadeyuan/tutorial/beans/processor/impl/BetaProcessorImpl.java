package com.wadeyuan.tutorial.beans.processor.impl;

import com.wadeyuan.tutorial.beans.processor.BetaProcessor;

/**
 * Created by wadey on 12/27/2016.
 */
public class BetaProcessorImpl implements BetaProcessor {
    @Override
    public void processBeta() {
        System.out.println("Beta processing task");
    }
}
