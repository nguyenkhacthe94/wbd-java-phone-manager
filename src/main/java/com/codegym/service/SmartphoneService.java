package com.codegym.service;

import com.codegym.model.Smartphone;

import java.util.Optional;

public interface SmartphoneService {
    Iterable<Smartphone> findAll();
Smartphone findById(Integer id);
Smartphone save(Smartphone smartphone);
Smartphone delete(Integer id);
}
