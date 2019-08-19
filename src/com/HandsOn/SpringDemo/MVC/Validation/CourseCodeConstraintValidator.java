package com.HandsOn.SpringDemo.MVC.Validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

   private String coursePrefix;

   public void initialize(CourseCode constraint) {
      coursePrefix = constraint.value();
   }

   public boolean isValid(String obj, ConstraintValidatorContext context) {

      boolean result;

      if(obj != null)
         result = obj.startsWith(coursePrefix);
      else
         result = true;

      return result;
   }
}
