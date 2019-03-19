package id.web.nisa.app;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xmlconfig.xml");
		
		Doctor doctor = context.getBean("myDoctor", Doctor.class);
		
		doctor.getDailyAppointment();
		
		Filler filler = (Filler)doctor;
		System.out.println(filler.getSkincentre().getSkincentreService());
		System.out.println(filler.getIddoc());
		System.out.println(filler.getName());
//		System.out.println(filler.getAddress());
//		System.out.println(filler.getEmail());
		
		//Bean scope : singleton
		Filler doctor1 = context.getBean("myDoctor", Filler.class);
		Filler doctor2 = context.getBean("myDoctor", Filler.class);
		System.out.println("doctor1: " + doctor1);
		System.out.println("doctor2: " + doctor2);
		
		doctor2.setName("Diganti");
		System.out.println("doctor1: " + doctor1.getName());
		System.out.println("doctor2: " + doctor2.getName());
		
		Filler doctor3 = context.getBean("myDoctorPrototype", Filler.class);
		Filler doctor4 = context.getBean("myDoctorPrototype", Filler.class);
		System.out.println("doctor3: " + doctor3);
		System.out.println("doctor4: " + doctor4);
		
		doctor3.setName("Bukan Test");
		System.out.println("doctor3: " + doctor3.getName());
		System.out.println("doctor4: " + doctor4.getName());
		context.close();
		

	}

}
