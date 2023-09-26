
package com.infinity.spring.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
    
    @RequestMapping("/")
    public String showFirstView(){
    return "first-view";
     }
    
    @RequestMapping("/askDetails")
    public String askVisitorDetails(Model model){

        model.addAttribute("visitor", new Visitor());
        
    return "ask-visitor-details-view";
    }
       
    
           @RequestMapping("/showDetails")
           public String showVisitorDetails(@Valid @ModelAttribute("visitor")Visitor vis, BindingResult bindingresult){

        
               if (bindingresult.hasErrors()) { // Errors validation true/false
                   return "ask-visitor-details-view";
               }else {
               
               
       String name = vis.getName();
       String title = vis.getTitle();
       
       //default name if none or spaces will printet       
        if ((name.length()==0) || (name.trim().length()==0)) {                   
                   vis.setName(title + "Muster");
               } else
        {vis.setName(title + StringUtils.capitalize(name.trim()));
        }
       
        if(vis.getRetirementType().length==0){
			vis.setRetirementType(new String []{"State"});
		}
        
//capitalize surname
       String surname = vis.getSurname();
       

       //default surname if none or spaces will printet
           if ((surname.length()==0) || (surname.trim().length()==0)) {                   
                   vis.setSurname("Musterman");
           } else
           {vis.setSurname(StringUtils.capitalize(surname.trim()));
           }
                
    return "show-visitor-details-view";
    }
               
               
               
               
    }
}
