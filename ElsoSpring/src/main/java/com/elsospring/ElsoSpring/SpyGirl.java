package com.elsospring.ElsoSpring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
class SpyGirl {
    public String iSaySomething() {
        return "Én egy kém vagyok!";
    }
}
