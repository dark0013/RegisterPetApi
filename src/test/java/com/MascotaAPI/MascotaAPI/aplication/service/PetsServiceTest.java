package com.MascotaAPI.MascotaAPI.aplication.service;

import com.MascotaAPI.MascotaAPI.domain.model.*;
import com.MascotaAPI.MascotaAPI.domain.port.in.IBreedApiServicePort;
import com.MascotaAPI.MascotaAPI.domain.port.out.IPetsRepositoryPort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class PetsServiceTest {
    private IPetsRepositoryPort petsRepositoryPort;
    private BreedService breedService; // Clase concreta, no interfaz
    private PetsService petsService;

    @BeforeEach
    void setUp() {
        petsRepositoryPort = mock(IPetsRepositoryPort.class);
        breedService = mock(BreedService.class); // Mock de la clase concreta
        petsService = new PetsService(petsRepositoryPort, breedService);
    }

    @Test
    void testSavePets_WithValidBreedInfo_ShouldPopulateFieldsAndSave() {
        // Arrange
        Pets inputPet = new Pets();
        inputPet.setName("Firulais");
        inputPet.setRace("1");

        BreedInfo breedInfo = new BreedInfo();
        breedInfo.setBreed_group("Toy");
        breedInfo.setBred_for("Small rodent hunting, lapdog");
        breedInfo.setLife_span("10 - 12 years");
        breedInfo.setTemperament("Active, Playful");

        Weight weight = new Weight();
        weight.setMetric("3 - 6");
        breedInfo.setWeight(weight);

        Height height = new Height();
        height.setMetric("23 - 29");
        breedInfo.setHeight(height);

        when(breedService.getBreedById("1")).thenReturn(Optional.of(breedInfo));
        when(petsRepositoryPort.savePets(any(Pets.class))).thenAnswer(i -> i.getArgument(0));

        // Act
        Pets result = petsService.savePets(inputPet);

        // Assert
        assertEquals(10, result.getAgeMin());
        assertEquals(12, result.getAgeMax());
        assertEquals(3.0, result.getWeightMin());
        assertEquals(6.0, result.getWeightMax());
        assertEquals(23.0, result.getHeightMin());
        assertEquals(29.0, result.getHeightMax());
        assertEquals("Toy", result.getRaceGroup());
        assertEquals("Small rodent hunting, lapdog", result.getPurposeRace());
        assertEquals("Active, Playful", result.getTemper());

        verify(petsRepositoryPort, times(1)).savePets(result);
        verify(breedService, times(1)).getBreedById("1");
    }
}
