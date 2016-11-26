package com.wadeyuan.tutorial.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by wadey on 11/26/2016.
 */
public class SpringContextUtil implements ApplicationContextAware{

    private static ApplicationContext applicationContext = null;

    /**
     * Invoked in ApplicationContextAwareProcessor, one of BeanPostProcessors which do their job after bean initialized.
     * So this class has to be configured in bean factory
     *
     * @param applicationContext
     * @throws BeansException
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Setting application context:" + SpringContextUtil.class.getName());
        this.applicationContext = applicationContext;
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public static java.lang.Object getBean(String name) {
        return applicationContext.getBean(name);
    }
}
