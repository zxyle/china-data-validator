package com.github.zxyle.validators;

import com.github.zxyle.constraints.ChinaMobile;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ChinaMobileValidator implements ConstraintValidator<ChinaMobile, String> {
    @Override
    public void initialize(ChinaMobile constraintAnnotation) {

    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        // 判断中国手机号的逻辑
        // 去掉+86
        // 11位
        // 1开头
        // 13 15 17 18 19
        return false;
    }
}
