package com.infinity.spring.mvc;

import com.infinity.spring.mvc.dao.SexDAO;
import com.infinity.spring.mvc.entity.Sex;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    
    @Autowired
    private SexDAO sexDAO;
    
     @RequestMapping("/valueControl")
    public String ShowValueControl(Model model) {
        List<Sex> allSexValue = sexDAO.getAllSex();
        model.addAttribute("allSexValue",allSexValue);
        return "value-control";
    }
    
    
    
    
    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }
    
    @RequestMapping("/askDetails")
    public String askVisitorDetails(Model model) {
        
        model.addAttribute("visitor", new Visitor());
        
        return "ask-visitor-details-view";
    }
    
    @RequestMapping("/showDetails")
    public String showVisitorDetails(@Valid @ModelAttribute("visitor") Visitor vis, BindingResult bindingresult) {
        
        if (bindingresult.hasErrors()) { // Errors validation true/false
            return "ask-visitor-details-view";
        } else {
            
            stateEditor(vis);
            nameEditor(vis);
            surnameEditor(vis);
            
            return "show-visitor-details-view";
        }
        
    }

    
   
    
    
    
    //State is a default value if choosen anything
    public void stateEditor(Visitor vis) {
        if (vis.getRetirementType().length == 0) {
            vis.setRetirementType(new String[]{"State"});
        }
    }

//default name if none or spaces will printet  + capitalize name  
    public void nameEditor(Visitor vis) {
        String name = vis.getName();
        String title = vis.getTitle();
        if ((name.length() == 0) || (name.trim().length() == 0)) {
            vis.setName(title + "Muster");
        } else {
            vis.setName(title + StringUtils.capitalize(name.trim()));
        }
        
    }

    //default surname if none or spaces will printet + capitalize surname 
    public void surnameEditor(Visitor vis) {
        String surname = vis.getSurname();
        if ((surname.length() == 0) || (surname.trim().length() == 0)) {
            vis.setSurname("Musterman");
        } else {
            vis.setSurname(StringUtils.capitalize(surname.trim()));
        }
    }
    
}
