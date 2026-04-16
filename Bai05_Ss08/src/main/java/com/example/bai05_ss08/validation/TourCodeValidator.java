package com.example.bai05_ss08.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class TourCodeValidator implements ConstraintValidator<ValidTourCode, String> {

    private static final String TOUR_CODE_REGEX = "^(VN_|INT_)\\d{5}$";

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || value.isBlank()) {
            return true;
        }
        return value.matches(TOUR_CODE_REGEX);
    }
}

