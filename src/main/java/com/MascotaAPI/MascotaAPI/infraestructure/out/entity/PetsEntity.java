package com.MascotaAPI.MascotaAPI.infraestructure.out.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tbl_reg_pets")
public class PetsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPets;
    private String name;
    private String age;

    private String address;
    private String city;
    private String race;

    private String averageAge;
    private String averageWeight;
    private String averageHeight;

    private String raceGroup;
    private String temper;
    private String purposeRace;
}
