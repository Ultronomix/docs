package com.revature.challenges.linked_list.test_utils;

import java.lang.annotation.*;

@Documented // This annotation will show up in the generated docs when used
@Target(ElementType.METHOD) // Indicates where we can use this annotation
@Retention(RetentionPolicy.RUNTIME) // Indicates when we are able to "see" this annotation
public @interface Test {

    // declares an argument that can be passed to this annotation
    // by including a "default clause" this value is optional.
    String description() default "";

}
