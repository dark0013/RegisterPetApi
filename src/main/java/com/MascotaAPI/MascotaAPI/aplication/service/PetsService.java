package com.MascotaAPI.MascotaAPI.aplication.service;

import com.MascotaAPI.MascotaAPI.domain.model.Pets;
import com.MascotaAPI.MascotaAPI.domain.port.in.IPetsServicePort;
import com.MascotaAPI.MascotaAPI.domain.port.out.IPetsRepositoryPort;

public class PetsService implements IPetsServicePort {

    private final IPetsRepositoryPort petsRport;

    public PetsService(IPetsRepositoryPort petsRport){
        this.petsRport = petsRport;
    }

    @Override
    public Pets savePets(Pets pets) {
        return petsRport.savePets(pets);
    }
}
