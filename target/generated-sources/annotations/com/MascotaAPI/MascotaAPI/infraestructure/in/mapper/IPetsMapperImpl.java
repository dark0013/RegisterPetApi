package com.MascotaAPI.MascotaAPI.infraestructure.in.mapper;

import com.MascotaAPI.MascotaAPI.domain.model.Pets;
import com.MascotaAPI.MascotaAPI.infraestructure.in.dto.PetsDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-14T23:59:28-0500",
    comments = "version: 1.6.3, compiler: javac, environment: Java 23.0.2 (Oracle Corporation)"
)
@Component
public class IPetsMapperImpl implements IPetsMapper {

    @Override
    public PetsDto toDto(Pets pets) {
        if ( pets == null ) {
            return null;
        }

        PetsDto petsDto = new PetsDto();

        petsDto.setIdPets( pets.getIdPets() );
        petsDto.setName( pets.getName() );
        petsDto.setAge( pets.getAge() );
        petsDto.setAddress( pets.getAddress() );
        petsDto.setCity( pets.getCity() );
        petsDto.setRace( pets.getRace() );
        petsDto.setAgeMin( pets.getAgeMin() );
        petsDto.setAgeMax( pets.getAgeMax() );
        petsDto.setWeightMin( pets.getWeightMin() );
        petsDto.setWeightMax( pets.getWeightMax() );
        petsDto.setHeightMin( pets.getHeightMin() );
        petsDto.setHeightMax( pets.getHeightMax() );
        petsDto.setRaceGroup( pets.getRaceGroup() );
        petsDto.setTemper( pets.getTemper() );
        petsDto.setPurposeRace( pets.getPurposeRace() );

        return petsDto;
    }

    @Override
    public Pets toDomain(PetsDto pets) {
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
}
