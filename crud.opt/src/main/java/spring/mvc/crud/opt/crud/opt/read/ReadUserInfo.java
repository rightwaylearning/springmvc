package spring.mvc.crud.opt.crud.opt.read;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.crud.opt.crud.opt.services.UserServicesImpl;

@RestController
public class ReadUserInfo {
	
	@Autowired
	private UserServicesImpl userServicesImpl;

	// http://localhost:8080/
	@GetMapping("/")
	public ModelAndView readAlluserInfo() {
		ModelAndView m= new ModelAndView("index");
		m.addObject("users",userServicesImpl.getAllUserList());
		return m;
	}
}
