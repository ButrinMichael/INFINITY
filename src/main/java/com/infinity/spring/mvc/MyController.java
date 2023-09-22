
package com.infinity.spring.mvc;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public String showVisitorDetails(@ModelAttribute("visitor")Visitor vis){
       String name = vis.getName();
       String title = vis.getTitle();
       vis.setName(title + name);

                
    return "show-visitor-details-view";
    }
}
