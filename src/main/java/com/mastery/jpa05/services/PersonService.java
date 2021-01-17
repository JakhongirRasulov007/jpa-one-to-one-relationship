package com.mastery.jpa05.services;

import com.mastery.jpa05.entities.Person;
import com.mastery.jpa05.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public void addPerson(Person person){
        personRepository.save(person);
    }
    public List<Person> getAll(){
        return personRepository.findAll();
    }
    public void update(Person person){
        personRepository.save(person);
    }

    public Person getPersonById(Integer personId) {
        return personRepository.findById(personId).get();
    }
}
