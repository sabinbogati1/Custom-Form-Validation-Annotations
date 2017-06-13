
package com.sabin.SpringValidation1.Validator;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class HobbyValidator implements ConstraintValidator<IsValidHobby, String>{

 //  private String listofValidHobbies;

    @Override
    public void initialize(IsValidHobby isvalidHobby) {
        //this.listofValidHobbies= isvalidHobby.listofValidHobbies();
    }

    @Override
    public boolean isValid(String studentHobby, ConstraintValidatorContext ctx) {
       
        if(studentHobby == null){
            return false;
        }
        
        
      //  if(studentHobby.matches(listofValidHobbies)){
            if(studentHobby.matches("Music|Football|Cricket|Hockey")){
                return true;
        }
        else{
            return false;
        }
        
    }
    
    
    
    
    
}
