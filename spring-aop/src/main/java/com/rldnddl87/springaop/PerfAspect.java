package com.rldnddl87.springaop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerfAspect {

    @Around("execution (* com.rldnddl87..*.EventService.*(..))")
    public Object logPerf(ProceedingJoinPoint pjp) throws Throwable{
        long begin = System.currentTimeMillis();
        Object obj = pjp.proceed();
        System.out.println(System.currentTimeMillis() - begin);
        return obj;
    }
}
