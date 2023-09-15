package com.example.springdemo.repositories;


import com.example.springdemo.entities.BandEntity;

import com.example.springdemo.entities.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BandRepository  extends JpaRepository<BandEntity, Long> {

    @Query(value = "SELECT p FROM Band p WHERE p.bandname = :bandname")
    List<BandEntity> findByBandname(@Param("bandname") String bandname);
}
