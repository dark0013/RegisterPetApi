package com.MascotaAPI.MascotaAPI.infraestructure.in.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.MascotaAPI.MascotaAPI.aplication.service",
        includeFilters = {
                @ComponentScan.Filter(type = org.springframework.context.annotation.FilterType.REGEX, pattern = "^.+Service")
        } )
public class BeanConfiguration {
}
