package com.example.bai05_ss08.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Constraint(validatedBy = PriceRangeValidator.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidPriceRange {

    String message() default "Gia tre em phai nho hon hoac bang gia nguoi lon";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}

