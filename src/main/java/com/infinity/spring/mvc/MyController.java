
package com.infinity.spring.mvc;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
    
    @RequestMapping("/")
    public String showFirstView(){
    return "first-view";
     }
    
    @RequestMapping("/askDetails")
    public String askVisitorDetails(){
    return "ask-visitor-details-view";
    }
       
//       @RequestMapping("/showDetails")
//    public String showVisitorDetails(){
//    return "show-visitor-details-view";
//    }
    
           @RequestMapping("/showDetails")
    public String showVisitorDetails(@RequestParam("visitorName")String visName,Model model){
       
        visName = "Mr. " + visName;
        model.addAttribute("nameAttribute", visName);
        
        
        
        
        
    return "show-visitor-details-view";
    }
}
