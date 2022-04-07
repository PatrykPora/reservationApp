package com.reservation.reservationapp.validation;

import com.reservation.reservationapp.dto.PlayerDto;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordEqualsValidator implements ConstraintValidator<PasswordEqualConstraint, PlayerDto> {

    @Override
    public void initialize(PasswordEqualConstraint constraintAnnotation) {
    }

    @Override
    public boolean isValid(PlayerDto playerDto, ConstraintValidatorContext constraintValidatorContext) {
        return playerDto.getRetypedPassword().equals(playerDto.getPassword());
    }
}
