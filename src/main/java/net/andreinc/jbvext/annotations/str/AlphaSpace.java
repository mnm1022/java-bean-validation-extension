package net.andreinc.jbvext.annotations.str;

import net.andreinc.jbvext.annotations.str.validators.AlphaSpaceValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Checks if the String contains only unicode letters and space (' ')
 */
@Documented
@Constraint(validatedBy = AlphaSpaceValidator.class)
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE})
@Retention(RUNTIME)
public @interface AlphaSpace {
    String message() default "{string.alphaspace}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
