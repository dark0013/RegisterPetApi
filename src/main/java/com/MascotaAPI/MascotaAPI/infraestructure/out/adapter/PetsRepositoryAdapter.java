package com.MascotaAPI.MascotaAPI.infraestructure.out.adapter;

import com.MascotaAPI.MascotaAPI.domain.model.Pets;
import com.MascotaAPI.MascotaAPI.domain.port.out.IPetsRepositoryPort;
import com.MascotaAPI.MascotaAPI.infraestructure.out.entity.PetsEntity;
import com.MascotaAPI.MascotaAPI.infraestructure.out.mapper.IPetsRepositoryMapper;
import com.MascotaAPI.MascotaAPI.infraestructure.out.repository.IPetsRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class PetsRepositoryAdapter implements IPetsRepositoryPort {
    private final IPetsRepository petsRepository;
    private final IPetsRepositoryMapper petsRepositoryMapper;

    public PetsRepositoryAdapter(IPetsRepository petsRepository, IPetsRepositoryMapper petsRepositoryMapper){
        this.petsRepository = petsRepository;
        this.petsRepositoryMapper = petsRepositoryMapper;
    }

    @Override
    public Pets savePets(Pets pets) {
        PetsEntity pet = petsRepository.save(petsRepositoryMapper.toEntity(pets));
        return petsRepositoryMapper.toDomain(pet);
    }


    @Override
    public List<Pets> findByFilters(String raceGroup, String race,
                                   Integer ageMin, Integer ageMax,
                                   Double weightMin, Double weightMax,
                                   Double heightMin, Double heightMax,
                                   String temper) {

        List<PetsEntity> entities = petsRepository.findByFilters(
                raceGroup, race, ageMin, ageMax,
                weightMin, weightMax, heightMin, heightMax, temper
        );

        return entities.stream()
                .map(petsRepositoryMapper::toDomain)
                .collect(Collectors.toList());
    }



}
