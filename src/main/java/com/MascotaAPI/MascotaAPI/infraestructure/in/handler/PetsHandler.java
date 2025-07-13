package com.MascotaAPI.MascotaAPI.infraestructure.in.handler;

import com.MascotaAPI.MascotaAPI.domain.port.in.IPetsServicePort;
import com.MascotaAPI.MascotaAPI.infraestructure.in.dto.PetsDto;
import com.MascotaAPI.MascotaAPI.infraestructure.in.mapper.IPetsMapper;
import org.springframework.stereotype.Component;

@Component
public class PetsHandler {
    private final IPetsServicePort petsServicePort;
    private final IPetsMapper petsMapper;

    public PetsHandler(IPetsServicePort petsServicePort,IPetsMapper petsMapper){
        this.petsServicePort=petsServicePort;
        this.petsMapper = petsMapper;
    }

    public PetsDto savePet(PetsDto pet){
        return petsMapper.toDto(petsServicePort.savePets(petsMapper.toDomain(pet)));
    }
}
