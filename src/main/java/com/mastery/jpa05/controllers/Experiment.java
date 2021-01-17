package com.mastery.jpa05.controllers;

import com.mastery.jpa05.entities.Passport;
import com.mastery.jpa05.entities.Person;
import com.mastery.jpa05.entities.enums.Gender;
import com.mastery.jpa05.services.PassportService;
import com.mastery.jpa05.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/experiment")
public class Experiment {

    @Autowired
    private PassportService passportService;
    @Autowired
    private PersonService personService;

    @PostMapping("")
    public void doStuff(){
        Passport passport = new Passport();
        passport.setCountry("usa");
        passportService.addPassport(passport);
        Person person = new Person();
        person.setPassport(passport);
        person.setAge(10);
        person.setGender(Gender.FEMALE);
        person.setName("alala");
        personService.addPerson(person);
    }
}
