package id.web.nisa.app;

public class Filler implements Doctor {
	
	private Skincentre skincentre;
	private String iddoc;
	private String name;
	private String address;
	private String email;
	
	@Override
	public void getDailyAppointment() {
		System.out.println("Welcome to Filler, Doctor.");
		
	}
	
	public Filler(Skincentre skincentre, String iddoc, String name, String address, String email) {
		super();
		this.skincentre = skincentre;
		this.iddoc = iddoc;
		this.name = name;
		this.address = address;
		this.email = email;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Filler() {
		
	}
	
	public Filler(Skincentre theSkincentre) {
		skincentre = theSkincentre;
	}
	
	public Skincentre getSkincentre() {
		return skincentre;
	}

	public void setSkincentre(Skincentre skincentre) {
		this.skincentre = skincentre;
	}

}

