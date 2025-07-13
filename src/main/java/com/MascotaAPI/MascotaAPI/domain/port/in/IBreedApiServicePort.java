package com.MascotaAPI.MascotaAPI.domain.port.in;

import com.MascotaAPI.MascotaAPI.domain.model.BreedInfo;

import java.util.List;
import java.util.Optional;

public interface IBreedApiServicePort {
    List<BreedInfo> getAllBreeds();
    Optional<BreedInfo> getBreedById(String race);
}
