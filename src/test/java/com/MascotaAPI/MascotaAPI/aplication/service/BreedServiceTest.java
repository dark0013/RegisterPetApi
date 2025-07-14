package com.MascotaAPI.MascotaAPI.aplication.service;

import com.MascotaAPI.MascotaAPI.domain.model.BreedInfo;
import com.MascotaAPI.MascotaAPI.domain.port.out.IBreedApiRepositoryPort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class BreedServiceTest {
    private IBreedApiRepositoryPort breedApiRepositoryPort;
    private BreedService breedService;

    @BeforeEach
    void setUp() {
        // Arrange: Mocks y clase a testear
        breedApiRepositoryPort = mock(IBreedApiRepositoryPort.class);
        breedService = new BreedService(breedApiRepositoryPort);
    }

    @Test
    void getAllBreeds_ReturnsListOfBreeds() {
        // Arrange
        List<BreedInfo> mockBreeds = List.of(new BreedInfo(), new BreedInfo());
        when(breedApiRepositoryPort.fetchAllBreeds()).thenReturn(mockBreeds);

        // Act
        List<BreedInfo> result = breedService.getAllBreeds();

        // Assert
        assertNotNull(result);
        assertEquals(2, result.size());
        verify(breedApiRepositoryPort).fetchAllBreeds();
    }

    @Test
    void getBreedById_WhenFound_ReturnsOptionalWithBreed() {
        // Arrange
        BreedInfo breed = new BreedInfo();
        String race = "akita";
        when(breedApiRepositoryPort.fetchBreedById(race)).thenReturn(Optional.of(breed));

        // Act
        Optional<BreedInfo> result = breedService.getBreedById(race);

        // Assert
        assertTrue(result.isPresent());
        assertEquals(breed, result.get());
        verify(breedApiRepositoryPort).fetchBreedById(race);
    }

    @Test
    void getBreedById_WhenNotFound_ReturnsEmptyOptional() {
        // Arrange
        String race = "nonexistent";
        when(breedApiRepositoryPort.fetchBreedById(race)).thenReturn(Optional.empty());

        // Act
        Optional<BreedInfo> result = breedService.getBreedById(race);

        // Assert
        assertFalse(result.isPresent());
        verify(breedApiRepositoryPort).fetchBreedById(race);
    }
}
