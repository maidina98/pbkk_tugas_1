package id.web.nisa.app;

import org.springframework.stereotype.Component;


@Component
public class DatabaseSkincentre implements Skincentre{
	
	@Override
	public String getSkincentreService() {
		// TODO Auto-generated method stub
		return "This is Skincentre's Data Base";
	}

}


