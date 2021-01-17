package com.mastery.jpa05.repositories;

import com.mastery.jpa05.entities.Passport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassportRepository extends JpaRepository<Passport,Integer> {
}
