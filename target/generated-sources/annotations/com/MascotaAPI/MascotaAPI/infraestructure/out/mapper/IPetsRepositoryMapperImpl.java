package com.MascotaAPI.MascotaAPI.infraestructure.out.mapper;

import com.MascotaAPI.MascotaAPI.domain.model.Pets;
import com.MascotaAPI.MascotaAPI.infraestructure.out.entity.PetsEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-14T23:59:28-0500",
    comments = "version: 1.6.3, compiler: javac, environment: Java 23.0.2 (Oracle Corporation)"
)
@Component
public class IPetsRepositoryMapperImpl implements IPetsRepositoryMapper {

    @Override
    public Pets toDomain(PetsEntity pets) {
        if ( pets == null ) {
            return null;
        }

        Pets pets1 = new Pets();

        pets1.setIdPets( pets.getIdPets() );
        pets1.setName( pets.getName() );
        pets1.setAge( pets.getAge() );
        pets1.setAddress( pets.getAddress() );
        pets1.setCity( pets.getCity() );
        pets1.setRace( pets.getRace() );
        pets1.setAgeMin( pets.getAgeMin() );
        pets1.setAgeMax( pets.getAgeMax() );
        pets1.setWeightMin( pets.getWeightMin() );
        pets1.setWeightMax( pets.getWeightMax() );
        pets1.setHeightMin( pets.getHeightMin() );
        pets1.setHeightMax( pets.getHeightMax() );
        pets1.setRaceGroup( pets.getRaceGroup() );
        pets1.setTemper( pets.getTemper() );
        pets1.setPurposeRace( pets.getPurposeRace() );

        return pets1;
    }

    @Override
    public PetsEntity toEntity(Pets pets) {
        if ( pets == null ) {
            return null;
        }

        PetsEntity petsEntity = new PetsEntity();

        petsEntity.setIdPets( pets.getIdPets() );
        petsEntity.setName( pets.getName() );
        petsEntity.setAge( pets.getAge() );
        petsEntity.setAddress( pets.getAddress() );
        petsEntity.setCity( pets.getCity() );
        petsEntity.setRace( pets.getRace() );
        petsEntity.setAgeMin( pets.getAgeMin() );
        petsEntity.setAgeMax( pets.getAgeMax() );
        petsEntity.setWeightMin( pets.getWeightMin() );
        petsEntity.setWeightMax( pets.getWeightMax() );
        petsEntity.setHeightMin( pets.getHeightMin() );
        petsEntity.setHeightMax( pets.getHeightMax() );
        petsEntity.setRaceGroup( pets.getRaceGroup() );
        petsEntity.setTemper( pets.getTemper() );
        petsEntity.setPurposeRace( pets.getPurposeRace() );

        return petsEntity;
    }
}
