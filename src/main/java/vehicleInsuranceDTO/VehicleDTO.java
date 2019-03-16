package vehicleInsuranceDTO;

import java.util.Date;

public class VehicleDTO {

	private String vehicleNo;
	private String vehicleType;
	private int insurancePeriod;
	private String aadharcardNo;
	private long mobileNo;
	private Date date;
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public int getInsurancePeriod() {
		return insurancePeriod;
	}
	public void setInsurancePeriod(int insurancePeriod) {
		this.insurancePeriod = insurancePeriod;
	}
	public String getAadharcardNo() {
		return aadharcardNo;
	}
	public void setAadharcardNo(String aadharcardNo) {
		this.aadharcardNo = aadharcardNo;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public VehicleDTO( String vehicleType, int insurancePeriod, String aadharcardNo, long mobileNo, Date date) {
		super();
		//this.vehicleNo = vehicleNo;
		this.vehicleType = vehicleType;
		this.insurancePeriod = insurancePeriod;
		this.aadharcardNo = aadharcardNo;
		this.mobileNo = mobileNo;
		this.date = date;
	}
	public VehicleDTO() {
		//super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
