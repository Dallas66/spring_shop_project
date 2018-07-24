package com.epam.rd.denis.springshop.validators;

import com.epam.rd.denis.springshop.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
@Component
public class PasswordValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return User.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        User user = (User) o;

        if (!(user.getPassword().equals(user.getConfirmPassword()))) {
            errors.rejectValue("confirmPassword", "notmatch.password");
        }
    }
}
