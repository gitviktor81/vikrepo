package com.elsospring.ElsoSpring.controller;

import com.elsospring.ElsoSpring.service.SpyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class HomeController {

    // Tightly coupled eljárás - EZ ÁLTAL NEM FOG MŰKÖDNI A SESSION SCOPE, mivel nincs beinnyektálás
    // Miden alkalommal amikor acontroller létrejön létrehoz egy SpyGirl-t
//    private SpyGirl spicy = new SpyGirl();

    // Loosely coupled eljárás - MŰKÖDIK A SESSION SCOPE, van beinnyektálás - FIELD alapú
//    @Autowired
//    private SpyGirl spicy;

    // Loosely coupled eljárás - MŰKÖDIK A SESSION SCOPE, van SETTER alapú beinnyektálás
    private SpyService spyService;

//    @Autowired
//    public void setSpicy(SpyGirl spicy) {
//        this.spicy = spicy;
//    }

//    Apllication properties-bol érték kiolvasása
    @Value("${HomeController.msg}")
    public String msg;
    @Value("${HomeController.randomValue}")
    public String randomValue;
    @Value("${HomeController.randomInt}")
    public int randomInt;

    // Loosely coupled eljárás - MŰKÖDIK A SESSION SCOPE, van beinnyektálás - CONTROLLER alapú
    @Autowired
    public HomeController(SpyService spyService) {
        this.spyService = spyService;
    }

    @RequestMapping("/")
    public String stories(Model model){
        //return "Szia Dorka :)";
        model.addAttribute("pageTitle", "dddd");
        return "stories";
        //return spyService.iSaySomething() + "  - -  " +  msg + "  - -  " + randomValue + "  - -  " + randomInt;
    }

    @RequestMapping("/stories/{id}")
    public String searchForStory(Model model, @PathVariable(value="id") String id) throws Exception {
        if (id == null) {
            throw new Exception("Nincs ilyen id!!!");
        }
        model.addAttribute("id", id);
        return "stories";
    }
}
