package com.InversionOfControl.InversionOfControl.model;

import java.util.UUID;

public class Vehicle {

    private VehicleType type;
    private UUID registrationNumber;

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public UUID getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(UUID registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Vehicle(VehicleType type, UUID registrationNumber) {
        this.type = type;
        this.registrationNumber = registrationNumber;


    }
}
