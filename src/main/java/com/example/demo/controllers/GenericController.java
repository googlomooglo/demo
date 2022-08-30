package com.example.demo.controllers;

import com.example.demo.controllers.data.AnotherPerson;
import com.example.demo.controllers.mappers.GenericMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.demo.controllers.data.Person;


public abstract class GenericController <RQ extends Person, RS extends AnotherPerson>{


    @PostMapping(path = "/person", produces = "application/json", consumes = "application/json")
    @ResponseBody
    public RS helloWorld(@RequestBody RQ request){
        return getMapper().from(request);
    }

    public abstract GenericMapper<RQ,RS> getMapper();

}
