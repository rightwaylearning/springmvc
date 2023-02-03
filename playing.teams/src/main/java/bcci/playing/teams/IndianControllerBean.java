package bcci.playing.teams;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class IndianControllerBean {

	@Autowired
	public ServiceInfo serviceInfo;
	
	@GetMapping("/india")
	public ModelAndView getIndianTeam() {
		ModelAndView m = new ModelAndView("indianteam");
		m.addObject("heading","Indian teams");
		m.addObject("team",serviceInfo.getIndianPlayerList());
		return m;
	}
	
	@GetMapping("/pakistan")
	public ModelAndView getPakistanTeam() {
		ModelAndView m = new ModelAndView("indianteam");
		m.addObject("heading","Pakistan teams");
		m.addObject("team",serviceInfo.getPakistanPlayerList());
		return m;
	}
}
