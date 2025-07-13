package com.MascotaAPI.MascotaAPI.infraestructure.out.adapter;

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
    private final String API_URL = "https://api.thedogapi.com/v1/breeds";
    private final String API_KEY = "live_IxhUo52LJYnNrnHmZHdtk81ucoigFxKXYeKgxYRAq38EZe41PR4YJfKFBep7g5AA";

    private final RestTemplate restTemplate;

    public BreedApiAdapter(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @Override
    public List<BreedInfo> fetchAllBreeds() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("x-api-key", API_KEY);
        HttpEntity<Void> entity = new HttpEntity<>(headers);

        ResponseEntity<BreedInfo[]> response = restTemplate.exchange(
                API_URL,
                HttpMethod.GET,
                entity,
                BreedInfo[].class
        );

        return Arrays.asList(response.getBody());
    }

    /*@Override
    public Optional<BreedInfo> fetchBreedById(Long id) {
        return fetchAllBreeds()
                .stream()
                .filter(breed -> breed.getId().equals(id))
                .findFirst();
    }*/

    @Override
    public Optional<BreedInfo> fetchBreedById(String race) {
        return fetchAllBreeds()
                .stream()
                .filter(breed -> breed.getName().trim().equalsIgnoreCase(race.trim()))
                .findFirst();
    }
}
