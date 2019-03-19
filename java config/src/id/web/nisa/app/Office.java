package id.web.nisa.app;



import org.springframework.stereotype.Component;

@Component
public class Office implements Skincentre {

	@Override
	public String getSkincentreService() {
		// TODO Auto-generated method stub
		return "Welcome to Nisa Skincentre";
	}

}
