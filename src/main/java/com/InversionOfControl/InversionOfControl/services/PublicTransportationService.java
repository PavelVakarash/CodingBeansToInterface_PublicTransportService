package com.InversionOfControl.InversionOfControl.services;

import com.InversionOfControl.InversionOfControl.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PublicTransportationService {

    private final VehicleProviderService vehicleProviderService;

    @Autowired
    public PublicTransportationService(VehicleProviderService vehicleProviderService) { // @Qualifier("taxi") - changing type
        this.vehicleProviderService = vehicleProviderService;
//  public PublicTransportationService(VehicleProviderService busProviderServiceImpl) {
//        this.vehicleProviderService = busProviderServiceImpl;

//    public PublicTransportationService(VehicleProviderService taxiProviderServiceImpl) {
//        this.vehicleProviderService = taxiProviderServiceImpl;

//  public PublicTransportationService(VehicleProviderService trainProviderServiceImpl) {
//        this.vehicleProviderService = trainProviderServiceImpl;
    }

    public Vehicle startTrip(){
     Vehicle vehicle = vehicleProviderService.getVehicle();
        System.out.println(vehicle.getType().toString() + " with registration (#" + vehicle.getRegistrationNumber().toString() + ") has left the station.");
        return vehicle;
    }

    public void endTrip(Vehicle vehicle){
        System.out.println(vehicle.getType().toString() + " with registration (#" + vehicle.getRegistrationNumber().toString() + ") has arrived at the destination.");

    }
}
