package com.MascotaAPI.MascotaAPI.infraestructure.in.mapper;

import com.MascotaAPI.MascotaAPI.domain.model.Pets;
import com.MascotaAPI.MascotaAPI.infraestructure.in.dto.PetsDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IPetsMapper {
    PetsDto toDto (Pets pets);
    Pets toDomain(PetsDto pets);
}
