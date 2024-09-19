package com.training.back.controller;

import com.training.back.models.PlanetNames;
import com.training.back.services.PlanetNamesService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@AllArgsConstructor
public class PlanetNamesController {
        private final PlanetNamesService planetNamesService;

        @GetMapping("/allPlanets")
        public List<PlanetNames> allPlanets() {
            return planetNamesService.getAllPlanetNames();
        }
    }
