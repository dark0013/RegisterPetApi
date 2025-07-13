package com.MascotaAPI.MascotaAPI.domain.port.out;

import com.MascotaAPI.MascotaAPI.domain.model.BreedInfo;

import java.util.List;
import java.util.Optional;

public interface IBreedApiRepositoryPort {
    List<BreedInfo> fetchAllBreeds();
    Optional<BreedInfo> fetchBreedById(String race);
}
