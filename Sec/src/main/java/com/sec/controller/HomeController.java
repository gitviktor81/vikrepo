package com.sec.controller;

import com.sec.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    private EmailService emailService;

    @Autowired
    public void setEmailService(EmailService emailService) {
        this.emailService = emailService;
    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/bloggers")
    public String bloggers() {
        return "bloggers";
    }

    @RequestMapping("/stories")
    public String stories() {
        return "stories";
    }

    @RequestMapping("/email")
    public String email() {
        emailService.sendMessage("viktor.kiss.81@gmail.com");
        return "email";
    }
}
