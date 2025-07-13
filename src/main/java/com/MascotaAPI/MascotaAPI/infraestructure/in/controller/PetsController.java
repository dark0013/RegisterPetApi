package com.MascotaAPI.MascotaAPI.infraestructure.in.controller;

import com.MascotaAPI.MascotaAPI.infraestructure.in.dto.PetsDto;
import com.MascotaAPI.MascotaAPI.infraestructure.in.handler.PetsHandler;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/pet")
public class PetsController {
    private final PetsHandler petsHandler;

    public PetsController (PetsHandler petsHandler){
        this.petsHandler = petsHandler;
    }

    @PostMapping
    public ResponseEntity<PetsDto> savePets(@RequestBody PetsDto pet){
        return ResponseEntity.ok(petsHandler.savePet(pet));
    }
}
