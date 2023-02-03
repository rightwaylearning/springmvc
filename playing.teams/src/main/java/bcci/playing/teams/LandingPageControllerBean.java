package bcci.playing.teams;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LandingPageControllerBean {
	
	
	@GetMapping("/")
	public ModelAndView getLandingPage() {
		ModelAndView m= new ModelAndView("landing");
		return m;
	}

}
