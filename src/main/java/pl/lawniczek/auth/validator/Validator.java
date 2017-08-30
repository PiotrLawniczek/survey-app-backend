package pl.lawniczek.auth.validator;

import org.springframework.validation.Errors;

/**
 * Created by elawpio on 2017-08-29.
 */
public interface Validator {

    boolean supports(Class<?> aClass);
    void validate(Object o, Errors errors);
}
