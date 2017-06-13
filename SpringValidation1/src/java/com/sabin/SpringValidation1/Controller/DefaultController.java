
package com.sabin.SpringValidation1.Controller;

import com.sabin.SpringValidation1.Model.Student;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class DefaultController {
    
    
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(){
        
        ModelAndView model= new ModelAndView("index");
        
        
        
        return model;
        }
    
    
    
    @RequestMapping(value = "/addForm",method = RequestMethod.GET)
    public ModelAndView addForm(){
        
        
        ModelAndView model1= new ModelAndView("AddForm");
        
        
        return model1;
    }
    
    
    @RequestMapping(value = "/submitForm", method = RequestMethod.POST )
    public ModelAndView submitForm(@Valid @ModelAttribute("sabin1") Student student, BindingResult result){
        
        if( result.hasErrors()){
            
            ModelAndView model2 = new ModelAndView("AddForm");
            return model2;
        }
        
        
        
        
        ModelAndView model2= new ModelAndView("SucessForm");
        
        return model2;
    }
    
    
    
}
