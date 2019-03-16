package vehicleInsuranceService;

import java.util.Date;

import vehicleInsuranceDAO.VehicleDAO;
import vehicleInsuranceDAO.VehicleDAOImpl;
import vehicleInsuranceDTO.VehicleDTO;

public class VehicleServiceImpl implements VehicleService {
VehicleDAO vehicleDAO = new VehicleDAOImpl();
	public int vehicleInsuranceRegister(String vehicleno,VehicleDTO register) {
		// TODO Auto-generated method stub
		int i = vehicleDAO.vehicleInsuranceRegister(vehicleno,register);
		return i;
	}
	public VehicleDTO insuranceValidityCheck(String vehicleno,Date date,int year) {
		// TODO Auto-generated method stub
		VehicleDTO vehicleDTO= new VehicleDTO();
		vehicleDTO=vehicleDAO.insuranceValidityCheck(vehicleno,date,year);
		return vehicleDTO;
	}

}
