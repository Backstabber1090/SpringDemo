package com.sood.vaibhav.aopExample.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class POintcutConfig {
@Pointcut("execution(* com.sood.vaibhav.aopExample.business.*.*(..))")
public void businesslayerCut() {}

@Pointcut("@annotation(com.sood.vaibhav.aopExample.aspect.TrackTime)")
public void timetrack() {}
}
