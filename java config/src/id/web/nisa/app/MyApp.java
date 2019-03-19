package id.web.nisa.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MedicalConfig.class);
		
		Facelifter face = context.getBean("facelifter", Facelifter.class);
		
		System.out.println(face.getDailyAppointment());
		System.out.println(face.getName());
		
		context.close();
	}

}