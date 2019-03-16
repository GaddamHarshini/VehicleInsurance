package vehicleInsuranceService;

import java.util.Date;

import vehicleInsuranceDTO.VehicleDTO;

public interface VehicleService {
	
	int vehicleInsuranceRegister(String vehicleno,VehicleDTO register);
	VehicleDTO insuranceValidityCheck(String vehicleno, Date date,int year);

}
