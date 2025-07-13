package com.MascotaAPI.MascotaAPI.infraestructure.in.controller;

import com.MascotaAPI.MascotaAPI.domain.model.Pets;
import com.MascotaAPI.MascotaAPI.domain.port.in.IPetsServicePort;
import com.MascotaAPI.MascotaAPI.infraestructure.in.dto.PetsDto;
import com.MascotaAPI.MascotaAPI.infraestructure.in.handler.PetsHandler;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pet")
public class PetsController {
    private final PetsHandler petsHandler;
    private final IPetsServicePort petsService;

    public PetsController (PetsHandler petsHandler,IPetsServicePort petsService){
        this.petsHandler = petsHandler;
        this.petsService = petsService;
    }

    @PostMapping
    public ResponseEntity<PetsDto> savePets(@RequestBody PetsDto pet){
        return ResponseEntity.ok(petsHandler.savePet(pet));
    }

    @GetMapping("/search")
    public List<Pets> searchPets(
            @RequestParam(required = false) String raceGroup,
            @RequestParam(required = false) String race,
            @RequestParam(required = false) Integer ageMin,
            @RequestParam(required = false) Integer ageMax,
            @RequestParam(required = false) Double weightMin,
            @RequestParam(required = false) Double weightMax,
            @RequestParam(required = false) Double heightMin,
            @RequestParam(required = false) Double heightMax,
            @RequestParam(required = false) String temper
    ) {
        return petsService.getPetsByFilters(
                raceGroup, race,
                ageMin, ageMax,
                weightMin, weightMax,
                heightMin, heightMax,
                temper);
    }

}
