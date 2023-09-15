package com.example.springdemo.controllers;



import com.example.springdemo.entities.BandEntity;
import com.example.springdemo.repositories.BandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Map;

@Controller
@RequestMapping(path = {"/band"})
public class BandController {

    private final BandRepository bandRepository;

    @Autowired
    public BandController(BandRepository bandRepository) {
        this.bandRepository = bandRepository;
    }
    @GetMapping
    public String indexAction(Map<String, Object> model) {
        bandRepository.findByBandname("NNMM");
        model.put("user", Arrays.asList("NNMM", "Daïne", "666leepOver"));

        return "band/index";
    }

    @PostMapping
    public String createAction(BandEntity entity) {
        this.bandRepository.save(entity);

        return "redirect:/band";
    }
}
