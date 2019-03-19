package id.web.nisa.app;

import org.springframework.beans.factory.annotation.Value;

public class Facelifter implements Doctor {
	
	private Skincentre skincentre;

	@Value("${test.iddoc}")
	private String iddoc;
	
	@Value("${test.name}")
	private String name;
	
	public Facelifter() {
		
	}
	
	public Facelifter(Skincentre skincentre) {
		this.skincentre = skincentre;
	}


	public Skincentre getSkincentre() {
		return skincentre;
	}



	public void setSkincentre(Skincentre skincentre) {
		this.skincentre = skincentre;
	}

	@Override
	public String getDailyAppointment() {
		// TODO Auto-generated method stub
		return "Welcome to Facelifter, Doctor.";
	}

	public String getIddoc() {
		return iddoc;
	}

	public void setIddoc(String iddoc) {
		this.iddoc = iddoc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
