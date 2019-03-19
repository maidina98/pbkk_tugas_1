package id.web.nisa.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:Support.properties")
public class MedicalConfig {
	//IoC
		//Create object
		@Bean
		public Doctor facelifter() {
			Facelifter facelifter = new Facelifter();
			return facelifter;
		}
		
		@Bean
		public Skincentre office() {
			return new Office();
		}
		
		@Bean
		public Doctor facelifter(Skincentre skincentre) {
			Facelifter face = new Facelifter(office());
			return face;
		}

}
