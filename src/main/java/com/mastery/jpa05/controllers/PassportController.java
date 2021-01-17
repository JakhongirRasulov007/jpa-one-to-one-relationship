package com.mastery.jpa05.controllers;

import com.mastery.jpa05.entities.Passport;
import com.mastery.jpa05.entities.Person;
import com.mastery.jpa05.services.PassportService;
import com.mastery.jpa05.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/passports")
public class PassportController {
    @Autowired
    private PassportService passportService;

    @Autowired
    private PersonService personService;

    @PostMapping("/{personId}")
    public void addPassport(@PathVariable(name = "personId") Integer personId,
                            @RequestBody Passport passport){
        Person person = personService.getPersonById(personId);
        passportService.addPassport(passport);
        person.setPassport(passport);

        passport.setPerson(person);
        personService.update(person);
        System.out.println(person.getPersonId() + "===============================");

    }

    @GetMapping("/all")
    public List<Passport> getAll(){
        return passportService.getAll();
    }
}
