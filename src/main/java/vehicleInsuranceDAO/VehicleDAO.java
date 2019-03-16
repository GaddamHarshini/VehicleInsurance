package vehicleInsuranceDAO;

import java.util.Date;

import vehicleInsuranceDTO.VehicleDTO;

public interface VehicleDAO {
	
	int vehicleInsuranceRegister(String vehicleno,VehicleDTO register);
	VehicleDTO insuranceValidityCheck(String vehicleno,Date date,int year);


}
