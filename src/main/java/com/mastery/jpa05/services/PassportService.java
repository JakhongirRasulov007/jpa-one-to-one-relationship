package com.mastery.jpa05.services;

import com.mastery.jpa05.entities.Passport;
import com.mastery.jpa05.repositories.PassportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassportService {
    @Autowired
    private PassportRepository passportRepository;

    public void addPassport(Passport passport){
        passportRepository.save(passport);
    }
    public List<Passport> getAll(){
        return passportRepository.findAll();
    }
    public void update(Passport passport){
        passportRepository.save(passport);
    }
}
