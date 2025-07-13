package com.MascotaAPI.MascotaAPI.infraestructure.in.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PetsDto {
    private Long idPets;
    private String name;
    private String age;

    private String address;
    private String city;
    private String race;

    //private String averageAge;
   //private String averageWeight;

    private Integer ageMin;
    private Integer ageMax;

    private Double weightMin;
    private Double weightMax;

    //private String averageHeight;

    private Double HeightMin;
    private Double HeightMax;

    private String raceGroup;
    private String temper;
    private String purposeRace;
}
