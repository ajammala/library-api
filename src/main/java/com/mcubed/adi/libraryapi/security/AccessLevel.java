package com.mcubed.adi.libraryapi.security;

import com.mcubed.adi.libraryapi.Roles;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface AccessLevel {
    Roles value() default Roles.NONE;
}
