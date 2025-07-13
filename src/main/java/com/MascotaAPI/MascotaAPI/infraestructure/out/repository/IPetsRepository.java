package com.MascotaAPI.MascotaAPI.infraestructure.out.repository;

import com.MascotaAPI.MascotaAPI.infraestructure.out.entity.PetsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPetsRepository extends JpaRepository<PetsEntity,Long> {
}
