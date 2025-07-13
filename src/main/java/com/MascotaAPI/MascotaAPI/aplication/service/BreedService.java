package com.MascotaAPI.MascotaAPI.aplication.service;

import com.MascotaAPI.MascotaAPI.domain.model.BreedInfo;
import com.MascotaAPI.MascotaAPI.domain.port.out.IBreedApiPort;

import java.util.List;
import java.util.Optional;

public class BreedService {
    private final IBreedApiPort breedApiPort;

    public BreedService(IBreedApiPort breedApiPort) {
        this.breedApiPort = breedApiPort;
    }

    public List<BreedInfo> getAllBreeds() {
        return breedApiPort.fetchAllBreeds();
    }

    public Optional<BreedInfo> getBreedById(Long id) {
        return breedApiPort.fetchBreedById(id);
    }
}
