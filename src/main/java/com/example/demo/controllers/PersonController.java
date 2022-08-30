package com.example.demo.controllers;

import com.example.demo.controllers.data.AnotherPerson;
import com.example.demo.controllers.data.Person;
import com.example.demo.controllers.mappers.GenericMapper;
import com.example.demo.controllers.mappers.PersonMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(path = "/gateway")
public class PersonController extends GenericController<Person, AnotherPerson> {


    @Override
    public GenericMapper<Person, AnotherPerson> getMapper() {
        return new PersonMapper();
    }
}
