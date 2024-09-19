package com.training.back.services.implementation;

import com.training.back.models.PlanetNames;
import com.training.back.repository.PlanetNamesRepository;
import com.training.back.services.PlanetNamesService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class PlanetNamesImplementation implements PlanetNamesService {
    private final PlanetNamesRepository planetNamesRepository;

    @Override
    public List<PlanetNames> getAllPlanetNames() {
        return planetNamesRepository.findAll();
    }
}
