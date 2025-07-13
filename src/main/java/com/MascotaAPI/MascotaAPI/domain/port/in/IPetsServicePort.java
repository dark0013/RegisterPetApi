package com.MascotaAPI.MascotaAPI.domain.port.in;

import com.MascotaAPI.MascotaAPI.domain.model.Pets;

import java.util.List;

public interface IPetsServicePort {
    Pets savePets(Pets pets);
    List<Pets> getPetsByFilters(String raceGroup, String race,
                               Integer ageMin, Integer ageMax,
                               Double weightMin, Double weightMax,
                               Double heightMin, Double heightMax,
                               String temper);
}
