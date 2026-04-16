package com.example.bai05_ss08.validation;

import com.example.bai05_ss08.model.TourDto;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PriceRangeValidator implements ConstraintValidator<ValidPriceRange, TourDto> {

    @Override
    public boolean isValid(TourDto value, ConstraintValidatorContext context) {
        if (value == null || value.getAdultPrice() == null || value.getChildPrice() == null) {
            return true;
        }

        boolean valid = value.getChildPrice().compareTo(value.getAdultPrice()) <= 0;
        if (!valid) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate(context.getDefaultConstraintMessageTemplate())
                    .addPropertyNode("childPrice")
                    .addConstraintViolation();
        }
        return valid;
    }
}

