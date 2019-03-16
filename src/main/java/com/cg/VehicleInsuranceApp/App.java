package com.cg.VehicleInsuranceApp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import vehicleInsuranceDTO.VehicleDTO;
import vehicleInsuranceService.VehicleService;
import vehicleInsuranceService.VehicleServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
	static VehicleDTO vehicleDTO = new VehicleDTO();
	static VehicleService vehicleService = new VehicleServiceImpl();
    public static void main( String[] args )
    {
    	do
    	{
       Scanner sc = new Scanner(System.in);
       System.out.println("1.VehicleInsuranceRegistration\n2.InsuranceValidityCheck\n3.Exit");
       int ch = sc.nextInt();
       switch (ch) {
	case 1: 
		    System.out.println("Enter Vehicle no");
		    String vehicleNo = sc.next();
		    vehicleDTO.setVehicleNo(vehicleNo);
		    
		    System.out.println("Enter Vehicle type");
		    String vehicleType=sc.next();
		    vehicleDTO.setVehicleType(vehicleType);
		    
		    System.out.println("Enter Insurance period");
		    int years = sc.nextInt();
		    vehicleDTO.setInsurancePeriod(years);
		    
		   
		    Date date = new Date();
		   vehicleDTO.setDate(date);
		    
		    System.out.println("Enter aadhar no");
		    String aadharNo = sc.next();
		    vehicleDTO.setAadharcardNo(aadharNo);
		    
		    
		    
		    System.out.println("Enter mobile no");
		    long mobileNo = sc.nextLong();
		    vehicleDTO.setMobileNo(mobileNo);
		    
		  int i =  vehicleService.vehicleInsuranceRegister(vehicleDTO.getVehicleNo(),vehicleDTO);
		  if(i!=0)
		  {
		    System.out.println("registered successfully");
		  }
		
		break;
		
	case 2:  
		
		String vehicleNum = vehicleDTO.getVehicleNo();
		vehicleService.insuranceValidityCheck(vehicleNum, vehicleDTO.getDate(),vehicleDTO.getInsurancePeriod());

	default:
		break;
	}
    	}while(true);
    }
}
