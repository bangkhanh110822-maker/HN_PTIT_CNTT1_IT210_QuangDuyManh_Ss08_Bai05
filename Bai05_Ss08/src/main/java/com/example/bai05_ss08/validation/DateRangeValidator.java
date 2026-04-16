package com.example.bai05_ss08.validation;

import com.example.bai05_ss08.model.TourDto;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class DateRangeValidator implements ConstraintValidator<ValidDateRange, TourDto> {

    @Override
    public boolean isValid(TourDto value, ConstraintValidatorContext context) {
        if (value == null || value.getStartDate() == null || value.getEndDate() == null) {
            return true;
        }

        boolean valid = value.getEndDate().isAfter(value.getStartDate());
        if (!valid) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate(context.getDefaultConstraintMessageTemplate())
                    .addPropertyNode("endDate")
                    .addConstraintViolation();
        }
        return valid;
    }
}

