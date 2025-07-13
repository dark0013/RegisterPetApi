package com.MascotaAPI.MascotaAPI.domain.port.in;

import com.MascotaAPI.MascotaAPI.domain.model.Pets;

public interface IPetsServicePort {
    Pets savePets(Pets pets);
}
