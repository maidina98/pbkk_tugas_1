package id.web.nisa.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("notationconfig.xml");
		
		Doctor doctor = context.getBean("dermatologist", Doctor.class);
		Dermatologist doct = context.getBean("dermatologist", Dermatologist.class);
		
		System.out.println(doctor.getDailyAppointment());
		System.out.println(doct.getSkincentre().getSkincentreService());

	}

}
