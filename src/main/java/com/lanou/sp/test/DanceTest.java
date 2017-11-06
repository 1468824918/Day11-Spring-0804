package com.lanou.sp.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by dllo on 17/11/6.
 */
//代表该注解是给类用的
@Target(ElementType.TYPE)
//代表该注解运行时生效
@Retention(RetentionPolicy.RUNTIME)
public @interface DanceTest {

}
