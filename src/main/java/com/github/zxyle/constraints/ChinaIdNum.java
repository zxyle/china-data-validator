package com.github.zxyle.constraints;


import com.github.zxyle.validators.ChinaIdNumValidator;

import javax.validation.Constraint;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

// 中国身份证号

@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = ChinaIdNumValidator.class)
@Documented
public @interface ChinaIdNum {

    String message() default "身份证错误";

}
