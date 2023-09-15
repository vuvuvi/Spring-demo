package com.example.springdemo.repositories;

import com.example.springdemo.entities.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Long> {
    @Query(value = "SELECT p FROM Person p WHERE p.firstname = :firstname")
    Optional<PersonEntity> findByFirstname(@Param("firstname") String firstname);
}
