package spring.mvc.crud.opt.crud.opt.delete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.crud.opt.crud.opt.services.UserServicesImpl;

@RestController
public class UserDeleteController {
    
	@Autowired
	UserServicesImpl userServicesImpl;
	
	@GetMapping("/delete/{userId}")
	public ModelAndView deleteRecord(@PathVariable("userId") Integer userId) {
		ModelAndView m =new ModelAndView("index");
		userServicesImpl.deleteUser(userId);
		m.addObject("users",userServicesImpl.getAllUserList());
		return m;
	}
	
}
