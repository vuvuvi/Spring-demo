package com.example.springdemo.controllers;
import com.example.springdemo.entities.BandEntity;
import com.example.springdemo.entities.DiscographyEntity;
import com.example.springdemo.repositories.DiscographyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(path = {"/discography"})
public class DiscographyController {
    

    private final DiscographyRepository discographyRepository;

    @Autowired
    public DiscographyController(DiscographyRepository discographyRepository) {
        this.discographyRepository = discographyRepository;
    }

    @GetMapping
    public String indexAction(Map<String, Object> model) {
        List<DiscographyEntity> disco =  discographyRepository.findByband("NNMM");
        List<DiscographyEntity> discoAlbum = discographyRepository.findByAlbum("NNMM");
        model.put("user", Arrays.asList("NNMM", "Daïne", "666leepOver"));

        return "discography/index";
    }


}
