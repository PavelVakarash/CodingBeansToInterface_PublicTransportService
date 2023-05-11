package com.InversionOfControl.InversionOfControl;

import com.InversionOfControl.InversionOfControl.model.Vehicle;
import com.InversionOfControl.InversionOfControl.services.PublicTransportationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class InversionOfControlApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(InversionOfControlApplication.class, args);

		PublicTransportationService publicTransportationService = context.getBean(PublicTransportationService.class);
		Vehicle vehicle = publicTransportationService.startTrip();
		publicTransportationService.endTrip(vehicle);
	}

}
