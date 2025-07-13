package com.MascotaAPI.MascotaAPI.domain.port.out;

import com.MascotaAPI.MascotaAPI.domain.model.Pets;

import java.util.List;

public interface IPetsRepositoryPort {
    Pets savePets(Pets pets);

    List<Pets> findByFilters(String raceGroup, String race,
                                   Integer ageMin, Integer ageMax,
                                   Double weightMin, Double weightMax,
                                   Double heightMin, Double heightMax,
                                   String temper);
}
