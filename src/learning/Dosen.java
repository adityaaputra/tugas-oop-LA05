package learning;

import java.time.LocalDate;

public class Dosen extends learning {
	

	String nama ;
	
	String phoneNumber; 
	
	String address;

	String email;
 

	public void persona(){

	this.nama = nama;
	this.phoneNumber = phoneNumber;
	this.address = address;
	this.email = email;
	
	}
	public String getOffice_hours() {
		return office_hours;
	}
	public void setOffice_hours(String office_hours) {
		this.office_hours = office_hours;
	}
	public String getJabatan_akademik() {
		return jabatan_akademik;
	}
	public void setJabatan_akademik(String jabatan_akademik) {
		this.jabatan_akademik = jabatan_akademik;
	}
}
	

	

	
	
