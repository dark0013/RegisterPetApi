package com.MascotaAPI.MascotaAPI.infraestructure.out.repository;

import com.MascotaAPI.MascotaAPI.infraestructure.out.entity.PetsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IPetsRepository extends JpaRepository<PetsEntity,Long>  {

    @Query("""
        SELECT p FROM PetsEntity p
        WHERE (:raceGroup IS NULL OR p.raceGroup = :raceGroup)
          AND (:race IS NULL OR p.race = :race)
          AND (:ageMin IS NULL OR p.ageMin >= :ageMin)
          AND (:ageMax IS NULL OR p.ageMax <= :ageMax)
          AND (:weightMin IS NULL OR p.weightMin >= :weightMin)
          AND (:weightMax IS NULL OR p.weightMax <= :weightMax)
          AND (:heightMin IS NULL OR p.heightMin >= :heightMin)
          AND (:heightMax IS NULL OR p.heightMax <= :heightMax)
          AND (:temper IS NULL OR LOWER(p.temper) LIKE LOWER(CONCAT('%', :temper, '%')))
    """)
    List<PetsEntity> findByFilters(
            @Param("raceGroup") String raceGroup,
            @Param("race") String race,
            @Param("ageMin") Integer ageMin,
            @Param("ageMax") Integer ageMax,
            @Param("weightMin") Double weightMin,
            @Param("weightMax") Double weightMax,
            @Param("heightMin") Double heightMin,
            @Param("heightMax") Double heightMax,
            @Param("temper") String temper
    );

}
