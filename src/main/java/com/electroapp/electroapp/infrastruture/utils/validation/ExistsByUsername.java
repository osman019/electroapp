package com.electroapp.electroapp.infrastruture.utils.validation;

import jakarta.validation.ConstraintValidator;

public @interface ExistsByUsername implements ConstraintValidator<ExistsByUsername,String> {

}
