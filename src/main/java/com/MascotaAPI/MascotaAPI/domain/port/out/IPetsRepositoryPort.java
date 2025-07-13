package com.MascotaAPI.MascotaAPI.domain.port.out;

import com.MascotaAPI.MascotaAPI.domain.model.Pets;

public interface IPetsRepositoryPort {
    Pets savePets(Pets pets);
}
