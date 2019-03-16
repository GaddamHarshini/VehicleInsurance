package vehicleInsuranceDAO;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import vehicleInsuranceDTO.VehicleDTO;

public class VehicleDAOImpl implements VehicleDAO {

	public int vehicleInsuranceRegister(String vehicleno,VehicleDTO register) {
		int count = 0;
		Map<String,VehicleDTO >vehicle;
		   vehicle=new HashMap<String, VehicleDTO>();
		 
			
		vehicle.put(vehicleno, new VehicleDTO(register.getVehicleType(),register.getInsurancePeriod(),register.getAadharcardNo(),register.getMobileNo(), register.getDate()));
		Set<String> keySet= new HashSet<String>(vehicle.keySet());
        Set<VehicleDTO> valueSet= new HashSet<VehicleDTO>(vehicle.values());
     // System.out.println(keySet);
      keySet.forEach(key-> System.out.println(key));
      valueSet.forEach(value-> System.out.println(value.getDate()));
    //  System.out.println(valueSet);
				count++;
				
				/*for (Map.Entry<String,VehicleDTO> m: vehicle.entrySet())  
				{
					System.out.println(m.getKey()+" "+m.getValue());
					
			}*/

					 
	 
		
			return count;
	}

	public VehicleDTO insuranceValidityCheck(String vehicleno, Date date,int year) {
		// TODO Auto-generated method stub
		VehicleDTO vehicleDTO = new VehicleDTO();
		//vehicleDTO.getDate();
		System.out.println(date);
		 Date currentDateString = date;
		 
		
		
		return null;
	}

}
