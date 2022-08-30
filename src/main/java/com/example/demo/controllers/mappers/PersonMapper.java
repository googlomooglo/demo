package com.example.demo.controllers.mappers;

import com.example.demo.controllers.data.AnotherPerson;
import com.example.demo.controllers.data.Person;
import org.springframework.stereotype.Component;


public class PersonMapper implements GenericMapper<Person, AnotherPerson> {
    @Override
    public AnotherPerson from(Person person) {
        AnotherPerson anotherPerson = new AnotherPerson();
        anotherPerson.setEmail("another person's email: " + person.getEmail());
        anotherPerson.setFirstName("another person's first name: " + person.getFirstName());
        anotherPerson.setLastName("another person's last name: " + person.getLastName());
        anotherPerson.setAnotherData("another data here!");
        return anotherPerson;
    }
}
