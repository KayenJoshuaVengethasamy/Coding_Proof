package com.training.back.repository;


import com.training.back.models.PlanetNames;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanetNamesRepository extends JpaRepository<PlanetNames, Long> {
}
