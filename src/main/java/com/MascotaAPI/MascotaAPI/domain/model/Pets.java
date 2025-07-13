package com.MascotaAPI.MascotaAPI.domain.model;

public class Pets {
    private Long idPets;
    private String name;
    private String age;

    private String address;
    private String city;
    private String race;

    //private String averageAge;
    private Integer ageMin;
    private Integer ageMax;

    //private String averageWeight;

    private Double weightMin;
    private Double weightMax;

   // private String averageHeight;

    private Double HeightMin;
    private Double HeightMax;

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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

//    public String getAverageAge() {
//        return averageAge;
//    }
//
//    public void setAverageAge(String averageAge) {
//        this.averageAge = averageAge;
//    }


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
        return HeightMin;
    }

    public void setHeightMin(Double heightMin) {
        HeightMin = heightMin;
    }

    public Double getHeightMax() {
        return HeightMax;
    }

    public void setHeightMax(Double heightMax) {
        HeightMax = heightMax;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
