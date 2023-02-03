package samplemvc.mvsdemo123;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class JspHandlerController {

	@GetMapping("/welcome")
	public ModelAndView gerJspPage() {
		ModelAndView m = new ModelAndView("welcome");
		return m;
	}
}
