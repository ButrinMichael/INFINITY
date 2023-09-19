
package com.infinity.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
       
       @RequestMapping("/showDetails")
    public String showVisitorDetails(){
    return "show-visitor-details-view";
    }
    
    
}
