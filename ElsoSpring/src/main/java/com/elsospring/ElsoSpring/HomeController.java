package com.elsospring.ElsoSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    // Tightly coupled eljárás - EZ ÁLTAL NEM FOG MŰKÖDNI A SESSION SCOPE, mivel nincs beinnyektálás
    // Miden alkalommal amikor acontroller létrejön létrehoz egy SpyGirl-t
//    private SpyGirl spicy = new SpyGirl();

    // Loosely coupled eljárás - MŰKÖDIK A SESSION SCOPE, van beinnyektálás - FIELD alapú
//    @Autowired
//    private SpyGirl spicy;

    // Loosely coupled eljárás - MŰKÖDIK A SESSION SCOPE, van SETTER alapú beinnyektálás
    private SpyGirl spicy;

//    @Autowired
//    public void setSpicy(SpyGirl spicy) {
//        this.spicy = spicy;
//    }


    // Loosely coupled eljárás - MŰKÖDIK A SESSION SCOPE, van beinnyektálás - CONTROLLER alapú
    @Autowired
    public HomeController(SpyGirl spicy) {
        this.spicy = spicy;
    }

    @RequestMapping("/")
    public String index(){



        //return "Szia Dorka :)";
        return spicy.iSaySomething();
    }
}
