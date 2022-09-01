package com.revature.jankunit;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // SOURCE = compilation, CLASS = class loading, RUNTIME = runtime
@Target(ElementType.METHOD) // delcares where this annotation can be used (can be an array of ElementTypes)
public @interface Test {
}
