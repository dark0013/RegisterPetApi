package com.MascotaAPI.MascotaAPI.aplication.service;

import com.MascotaAPI.MascotaAPI.domain.model.BreedInfo;
import com.MascotaAPI.MascotaAPI.domain.port.in.IBreedApiServicePort;
import com.MascotaAPI.MascotaAPI.domain.port.out.IBreedApiRepositoryPort;

import java.util.List;
import java.util.Optional;

public class BreedService implements IBreedApiServicePort {
    private final IBreedApiRepositoryPort breedApiPort;

    public BreedService(IBreedApiRepositoryPort breedApiPort) {
        this.breedApiPort = breedApiPort;
    }
    @Override
    public List<BreedInfo> getAllBreeds() {
        return breedApiPort.fetchAllBreeds();
    }

    @Override
    public Optional<BreedInfo> getBreedById(String race) {
        return breedApiPort.fetchBreedById(race);
    }
}
