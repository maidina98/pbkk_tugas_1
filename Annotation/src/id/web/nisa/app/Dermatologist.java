package id.web.nisa.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import id.web.nisa.app.Skincentre;;

//@Component("myDermatologist")

//Default bean ID : dermatologist
@Component
public class Dermatologist implements Doctor {
	//dependency injection using field directly
		@Autowired
		@Qualifier ("dataBaseSkincentre")
		private Skincentre skincentre;
		
		public Dermatologist() {
			// TODO Auto-generated constructor stub
		}
		
		//dependency injection using constructor
		//@Autowired
		public Dermatologist(Skincentre skincentre) {
			this.skincentre = skincentre;
		}
		
		public Skincentre getSkincentre() {
			return skincentre;
		}
		
		//dependency injection using setter / mutator
		//@Autowired
		public void setSkincentre(Skincentre skincentre) {
			this.skincentre = skincentre;
		}

		@Override
		public String getDailyAppointment() {
			// TODO Auto-generated method stub
			return "Welcome to Dermatologist, Doctor";
		}
		


}
