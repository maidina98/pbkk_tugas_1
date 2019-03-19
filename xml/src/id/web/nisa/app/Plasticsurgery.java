package id.web.nisa.app;


public class Plasticsurgery implements Doctor {
	
	private Skincentre skincentre;

	public Plasticsurgery() {

	}
	
	public Plasticsurgery(Skincentre theSkincentre) {
		skincentre = theSkincentre;
	}

	public Skincentre getSkincentre() {
		return skincentre;
	}


	public void setSkincentre(Skincentre skincentre) {
		this.skincentre = skincentre;
	}


	@Override
	public void getDailyAppointment() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Plasticsurgery, Doctor.");
		
	}
	
	
	
}
