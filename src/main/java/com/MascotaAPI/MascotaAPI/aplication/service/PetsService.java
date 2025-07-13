package com.MascotaAPI.MascotaAPI.aplication.service;

import com.MascotaAPI.MascotaAPI.domain.model.BreedInfo;
import com.MascotaAPI.MascotaAPI.domain.model.Pets;
import com.MascotaAPI.MascotaAPI.domain.port.in.IBreedApiServicePort;
import com.MascotaAPI.MascotaAPI.domain.port.in.IPetsServicePort;
import com.MascotaAPI.MascotaAPI.domain.port.out.IPetsRepositoryPort;

import java.util.Optional;

public class PetsService implements IPetsServicePort {

    private final IPetsRepositoryPort petsRport;
    private final IBreedApiServicePort breedService;

    public PetsService(IPetsRepositoryPort petsRport, BreedService breedService){
        this.petsRport = petsRport;
        this.breedService = breedService;
    }

    @Override
    public Pets savePets(Pets pets) {
        Optional<BreedInfo> breedInfo = breedService.getBreedById(pets.getRace());
        if(breedInfo.isPresent()){
            pets.setAverageAge(breedInfo.get().getLife_span());
            pets.setAverageWeight(breedInfo.get().getWeight().getMetric());
            pets.setAverageHeight(breedInfo.get().getHeight().getMetric());
            pets.setRaceGroup(breedInfo.get().getBreed_group());
            pets.setTemper(breedInfo.get().getTemperament());
            pets.setPurposeRace(breedInfo.get().getBred_for());
        }else{
            System.out.print("no se encontro la raza");
        }
        System.out.println(breedInfo.toString());
        return petsRport.savePets(pets);
    }
}
