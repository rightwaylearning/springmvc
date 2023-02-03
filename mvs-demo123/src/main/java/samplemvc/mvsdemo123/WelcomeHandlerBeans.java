package samplemvc.mvsdemo123;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class WelcomeHandlerBeans {

	@GetMapping("/message")
	public ModelAndView getData() {
		ModelAndView v= new ModelAndView("message");
		return v;
	}
}
