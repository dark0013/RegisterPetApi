package com.MascotaAPI.MascotaAPI.aplication.service;

import com.MascotaAPI.MascotaAPI.domain.model.BreedInfo;
import com.MascotaAPI.MascotaAPI.domain.model.Pets;
import com.MascotaAPI.MascotaAPI.domain.port.in.IBreedApiServicePort;
import com.MascotaAPI.MascotaAPI.domain.port.in.IPetsServicePort;
import com.MascotaAPI.MascotaAPI.domain.port.out.IPetsRepositoryPort;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Optional;



public class PetsService implements IPetsServicePort {

    private static final Logger log = LoggerFactory.getLogger(PetsService.class);
    private final IPetsRepositoryPort petsRport;
    private final IBreedApiServicePort breedService;

    public PetsService(IPetsRepositoryPort petsRport, BreedService breedService){
        this.petsRport = petsRport;
        this.breedService = breedService;
    }

    @Override
    public Pets savePets(Pets pets) {
        Optional<BreedInfo> breedInfo = breedService.getBreedById(pets.getRace());
        if(breedInfo.isPresent()){

            Integer[] rangeAge = parseRangeAge(breedInfo.get().getLife_span());
            pets.setAgeMin(rangeAge[0]);
            pets.setAgeMax(rangeAge[1]);

            Double [] rangeWeight = parseRange(breedInfo.get().getWeight().getMetric());
            pets.setWeightMin(rangeWeight[0]);
            pets.setWeightMax(rangeWeight[1]);

            Double [] rangeHeight = parseRange(breedInfo.get().getHeight().getMetric());
            pets.setHeightMin(rangeHeight[0]);
            pets.setHeightMax(rangeHeight[1]);

            pets.setRaceGroup(breedInfo.get().getBreed_group());
            pets.setTemper(breedInfo.get().getTemperament());
            pets.setPurposeRace(breedInfo.get().getBred_for());
            log.info("Datos de raza agregados para la mascota: {}", pets.getName());
        }else{
            log.info("Mensaje de log");
        }

        return petsRport.savePets(pets);
    }



    private Double[] parseRange(String metric) {
        if (metric == null || metric.isBlank()) {
            return new Double[]{null, null};
        }

        try {
            if (metric.contains("-")) {
                String[] parts = metric.split("-");
                double min = Double.parseDouble(parts[0].trim());
                double max = Double.parseDouble(parts[1].trim());
                return new Double[]{min, max};
            } else {
                double value = Double.parseDouble(metric.trim());
                return new Double[]{value, value}; // mismo valor como min y max
            }
        } catch (NumberFormatException e) {
            // puedes registrar el error aquí si necesitas
            return new Double[]{null, null};
        }
    }

    private Integer[] parseRangeAge(String raw) {
        if (raw == null || raw.isBlank()) {
            return new Integer[]{null, null};
        }

        // Quitar palabras no numéricas (como "years", "kg", "cm", etc.)
        String cleaned = raw.replaceAll("[^0-9\\-\\.]", ""); // Deja solo números, guiones y puntos

        try {
            if (cleaned.contains("-")) {
                String[] parts = cleaned.split("-");
                if (parts.length == 2) {
                    double minDouble = Double.parseDouble(parts[0].trim());
                    double maxDouble = Double.parseDouble(parts[1].trim());
                    Integer min = (int) minDouble; // Truncar a entero
                    Integer max = (int) maxDouble;
                    return new Integer[]{min, max};
                }
            } else {
                // Si no tiene guion, se asume un solo valor
                double valueDouble = Double.parseDouble(cleaned.trim());
                Integer value = (int) valueDouble;
                return new Integer[]{value, value};
            }
        } catch (NumberFormatException e) {
            return new Integer[]{null, null};
        }

        return new Integer[]{null, null};
    }

    @Override
    public List<Pets> getPetsByFilters(String raceGroup, String race,
                                      Integer ageMin, Integer ageMax,
                                      Double weightMin, Double weightMax,
                                      Double heightMin, Double heightMax,
                                      String temper) {
        return petsRport.findByFilters(raceGroup, race, ageMin, ageMax,
                weightMin, weightMax, heightMin, heightMax, temper);
    }

}
