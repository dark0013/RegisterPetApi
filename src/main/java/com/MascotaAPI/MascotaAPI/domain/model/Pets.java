package com.MascotaAPI.MascotaAPI.domain.model;

public class Pets {
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

    public String getAverageAge() {
        return averageAge;
    }

    public void setAverageAge(String averageAge) {
        this.averageAge = averageAge;
    }

    public String getAverageWeight() {
        return averageWeight;
    }

    public void setAverageWeight(String averageWeight) {
        this.averageWeight = averageWeight;
    }

    public String getAverageHeight() {
        return averageHeight;
    }

    public void setAverageHeight(String averageHeight) {
        this.averageHeight = averageHeight;
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
