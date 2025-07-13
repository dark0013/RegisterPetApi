package com.MascotaAPI.MascotaAPI.infraestructure.out.mapper;

import com.MascotaAPI.MascotaAPI.domain.model.Pets;
import com.MascotaAPI.MascotaAPI.infraestructure.out.entity.PetsEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IPetsRepositoryMapper {

    Pets toDomain(PetsEntity pets);
    PetsEntity toEntity (Pets pets);
}
