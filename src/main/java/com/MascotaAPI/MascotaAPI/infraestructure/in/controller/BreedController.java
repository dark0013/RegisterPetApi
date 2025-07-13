package com.MascotaAPI.MascotaAPI.infraestructure.in.controller;

import com.MascotaAPI.MascotaAPI.aplication.service.BreedService;
import com.MascotaAPI.MascotaAPI.domain.model.BreedInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/breeds")
public class BreedController {

    private final BreedService breedService;

    public BreedController(BreedService breedService) {
        this.breedService = breedService;
    }

    @GetMapping
    public List<BreedInfo> getAllBreeds() {
        return breedService.getAllBreeds();
    }

    @GetMapping("/{id}")
    public BreedInfo getBreedById(@PathVariable Long id) {
        return breedService.getBreedById(id).orElseThrow(() -> new RuntimeException("Raza no encontrada"));
    }
}
