package com.wadeyuan.tutorial.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by wadey on 12/5/2016.
 */
public class TaskProcessorAspect {
    public void beforeProcess() {
        System.out.println("Before processing task");
    }

    public void afterProcess() {
        System.out.println("After processing task");
    }

    public void aroundProcess(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Around processing task - before");
        joinPoint.proceed();
        System.out.println("Around processing task - after");
    }
}
