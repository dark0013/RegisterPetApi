package com.MascotaAPI.MascotaAPI.infraestructure.out.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity

@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tbl_reg_pets")
public class PetsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPets;
    private String name;
    private Integer  age;

    private String address;
    private String city;
    private String race;

    private Integer ageMin;
    private Integer ageMax;

    private Double weightMin;
    private Double weightMax;

    private Double heightMin;
    private Double heightMax;

    private String raceGroup;
    private String temper;
    private String purposeRace;

    public Long getIdPets() {
        return idPets;
    }

    public void setIdPets(Long idPets) {
        this.idPets = idPets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Integer getAgeMin() {
        return ageMin;
    }

    public void setAgeMin(Integer ageMin) {
        this.ageMin = ageMin;
    }

    public Integer getAgeMax() {
        return ageMax;
    }

    public void setAgeMax(Integer ageMax) {
        this.ageMax = ageMax;
    }

    public Double getWeightMin() {
        return weightMin;
    }

    public void setWeightMin(Double weightMin) {
        this.weightMin = weightMin;
    }

    public Double getWeightMax() {
        return weightMax;
    }

    public void setWeightMax(Double weightMax) {
        this.weightMax = weightMax;
    }

    public Double getHeightMin() {
        return heightMin;
    }

    public void setHeightMin(Double heightMin) {
        this.heightMin = heightMin;
    }

    public Double getHeightMax() {
        return heightMax;
    }

    public void setHeightMax(Double heightMax) {
        this.heightMax = heightMax;
    }

    public String getRaceGroup() {
        return raceGroup;
    }

    public void setRaceGroup(String raceGroup) {
        this.raceGroup = raceGroup;
    }

    public String getTemper() {
        return temper;
    }

    public void setTemper(String temper) {
        this.temper = temper;
    }

    public String getPurposeRace() {
        return purposeRace;
    }

    public void setPurposeRace(String purposeRace) {
        this.purposeRace = purposeRace;
    }
}
