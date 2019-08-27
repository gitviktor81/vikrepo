package com.elsospring.ElsoSpring.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
//@Service
@Service("SpyService")
@Scope("singleton")
public class SpyService {
    public String iSaySomething() {
        return "Service response!";
    }
}
