package com.sec.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

// Meg tudjuk vele mondani hogy melyik controllerben definiált fgvünket milyen szintű felhasználó érhesse el
@EnableGlobalMethodSecurity(securedEnabled = true)
@Configuration
public class SecurityConf extends WebSecurityConfigurerAdapter {


    // EZ AZ EGYES AUTHENTIKÁCIÓKAT CONFIGURÁLJA - JOGKÖRÖKET - ROLES
    @Autowired
    protected void configureAuth(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("kiv")
                .password("{noop}letmein")
                .roles("USER")
                .and()
                .withUser("kivadmin")
                .password("{noop}letmein")
                .roles("ADMIN");
    }

    // EZ A SZERVER VISELKEDÉSÉT KONFIGURÁLJA
    @Override
    protected void configure(HttpSecurity httpSec) throws Exception {
        httpSec
                .authorizeRequests()
                .antMatchers(HttpMethod.GET, "/").permitAll()
                .antMatchers("/delete").hasRole("ADMIN")  // request küldőjének van-e ADMIN jogköre
                .antMatchers("/admin/**").hasRole("ADMIN")  // /admin/valami esetén ADMINNAK kell lenniea felhasználónak
                .and().formLogin().permitAll(); // DE a form login-t mindenkin számára elérhetővé teszem

    }
}
