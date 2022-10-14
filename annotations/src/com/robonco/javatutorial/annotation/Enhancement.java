package com.robonco.javatutorial.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

@Documented
@Repeatable(Enhancements.class)
@Target(ElementType.TYPE)
public @interface Enhancement {
    int id();
    String synopsis();
    String engineer() default "[unassigned]";
    String date() default "[unknown]";
}
