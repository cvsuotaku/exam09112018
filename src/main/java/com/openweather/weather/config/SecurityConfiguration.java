package com.openweather.weather.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.h2.H2ConsoleProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter  {
	
	@Autowired
    private H2ConsoleProperties console;
	
	@Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
		
		 String path = this.console.getPath();
         String antPattern = (path.endsWith("/") ? path + "**" : path + "/**");
         
		httpSecurity
        .headers()
	    .contentTypeOptions()
	    .and()
	    .xssProtection()
	    .and()
	    .cacheControl()
	    .and()
	    .httpStrictTransportSecurity()
	    .and()
	    .frameOptions().sameOrigin();
		
        httpSecurity
        .authorizeRequests()
        .anyRequest()
        .permitAll()
        .and()
        .httpBasic()
        .and()
        .csrf()
        .ignoringAntMatchers(antPattern);
    }
}
