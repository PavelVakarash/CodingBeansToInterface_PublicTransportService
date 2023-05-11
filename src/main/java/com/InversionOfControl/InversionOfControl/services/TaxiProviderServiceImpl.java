package com.InversionOfControl.InversionOfControl.services;

import com.InversionOfControl.InversionOfControl.model.Vehicle;
import com.InversionOfControl.InversionOfControl.model.VehicleType;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Profile("taxi")
//@Service("taxi")
//@Primary
public class TaxiProviderServiceImpl implements VehicleProviderService{
    @Override
    public Vehicle getVehicle() {
        return new Vehicle(VehicleType.TAXI, UUID.randomUUID());
    }
}
