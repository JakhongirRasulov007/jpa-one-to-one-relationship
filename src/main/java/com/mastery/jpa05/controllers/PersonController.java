package com.mastery.jpa05.controllers;

import com.mastery.jpa05.entities.Person;
import com.mastery.jpa05.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/register")
    public void addPerson(@RequestBody Person person){
        personService.addPerson(person);
    }

    @GetMapping("/all")
    public List<Person> getAll(){
        return personService.getAll();
    }
}
