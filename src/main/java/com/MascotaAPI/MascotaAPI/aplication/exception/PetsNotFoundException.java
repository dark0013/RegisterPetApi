package com.MascotaAPI.MascotaAPI.aplication.exception;

public class PetsNotFoundException extends RuntimeException{
    public PetsNotFoundException (String message){
        super(message);
    }
}
