package com.training.back.repository;

import com.training.back.models.Routes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoutesRepository  extends JpaRepository<Routes, Long> {
}
