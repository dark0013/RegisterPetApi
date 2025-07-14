package com.MascotaAPI.MascotaAPI.infraestructure.out.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.MascotaAPI.MascotaAPI.domain.model.BreedInfo;
import com.MascotaAPI.MascotaAPI.domain.port.out.IBreedApiRepositoryPort;
import org.springframework.web.client.RestTemplate;

import org.springframework.http.*;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.Arrays;
import java.util.List;
@Component
public class BreedApiAdapter implements IBreedApiRepositoryPort {

    private static final Logger log = LoggerFactory.getLogger(BreedApiAdapter.class);
    private final String API_URL = "https://api.thedogapi.com/v1/breeds";
    private final String API_KEY = "live_IxhUo52LJYnNrnHmZHdtk81ucoigFxKXYeKgxYRAq38EZe41PR4YJfKFBep7g5AA";

    private final RestTemplate restTemplate;

    public BreedApiAdapter(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @Override
    public List<BreedInfo> fetchAllBreeds() {
        log.info("Iniciando llamada al API externo para obtener todas las razas");
        HttpHeaders headers = new HttpHeaders();
        headers.set("x-api-key", API_KEY);
        HttpEntity<Void> entity = new HttpEntity<>(headers);

        try {
            ResponseEntity<BreedInfo[]> response = restTemplate.exchange(
                    API_URL,
                    HttpMethod.GET,
                    entity,
                    BreedInfo[].class
            );
            log.info("Respuesta exitosa del API externo, se obtuvieron {} razas",
                    response.getBody() != null ? response.getBody().length : 0);
            return Arrays.asList(response.getBody());
        } catch (Exception e) {
            log.error("Error al llamar al API externo para obtener razas", e);
            throw e;  // o maneja la excepción como necesites
        }

    }


    @Override
    public Optional<BreedInfo> fetchBreedById(String race) {
        return fetchAllBreeds()
                .stream()
                .filter(breed -> breed.getName().trim().equalsIgnoreCase(race.trim()))
                .findFirst();
    }
}
