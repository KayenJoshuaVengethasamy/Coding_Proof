package com.training.back.services;

import com.training.back.models.Routes;

import java.util.List;

public interface RoutesService {
    List<Routes> getAllRoutes();

    Routes getRoutesByID(Long ID);
    Routes getRouteByNodes(String origin, String destination);
}
