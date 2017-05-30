package com.efilot.validation.constraints;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EqualsWithValidator implements ConstraintValidator
        <EqualsWith, String> {
    private String compareWith;
    @Override
    public void initialize(EqualsWith equalsWithAnnotation) {
        this.compareWith = equalsWithAnnotation.compareWith();
    }

    @Override
    public boolean isValid(String inputString, ConstraintValidatorContext cvc) {
        return inputString == null || inputString.equals(this.compareWith);
    }
    
}
