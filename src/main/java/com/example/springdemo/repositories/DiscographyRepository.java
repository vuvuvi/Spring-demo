package com.example.springdemo.repositories;

import com.example.springdemo.entities.DiscographyEntity;
import com.example.springdemo.entities.DiscographyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface DiscographyRepository extends JpaRepository<DiscographyEntity, Long> {
    @Query(value = "SELECT p FROM Discography p JOIN p.bandEntity b WHERE b.bandname = :bandname")
    List<DiscographyEntity> findByband(@Param("bandname") String bandname);
    @Query(value = "SELECT p FROM Discography p WHERE p.album = :album")
    List<DiscographyEntity> findByAlbum(@Param("album") String album);
    
}
