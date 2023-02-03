package spring.mvc.example.rwl_web_app_mvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomePageControllerBean {
	// http://localhost:8080/
	@GetMapping(value = "/")
	public ModelAndView getLandingPage() {
		ModelAndView m = new ModelAndView("landingpage");
		return m;
	}

	// http://localhost:8080/home
	@GetMapping(value = "/home")
	public ModelAndView getHomePage() {
		ModelAndView m = new ModelAndView("home");
		return m;
	}

	// http://localhost:8080/contact
	@GetMapping(value = "/contact")
	public ModelAndView getContactPage() {
		ModelAndView m = new ModelAndView("contact");
		return m;
	}

	// http://localhost:8080/about
	@GetMapping(value = "/about")
	public ModelAndView getAboutPage() {
		ModelAndView m = new ModelAndView("about");
		return m;
	}

}
