package com.example.bai05_ss08.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Constraint(validatedBy = TourCodeValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidTourCode {

    String message() default "Ma tour phai theo mau VN_12345 hoac INT_12345";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}

