package com.example.demo.config;

import com.example.demo.controllers.data.AnotherPerson;
import com.example.demo.controllers.data.Person;
import com.example.demo.controllers.mappers.GenericMapper;
import com.example.demo.controllers.mappers.PersonMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.example.demo")
public class Config {

    @Bean("controllerMapper")
    public PersonMapper mapper(){
        return new PersonMapper();
    }
}
