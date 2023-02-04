package spring.mvc.crud.opt.crud.opt.update;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.crud.opt.crud.opt.model.User;
import spring.mvc.crud.opt.crud.opt.services.UserServicesImpl;

@RestController
public class UserUpdateControllerBean {

	@Autowired
	UserServicesImpl userServicesImpl;
	
	@GetMapping("/update/{userId}")
	public ModelAndView showUpdatedUser(@PathVariable("userId") Integer userId) {
		ModelAndView m = new ModelAndView("edit");
		User user = userServicesImpl.getUser(userId);
		m.addObject("user",user);		
		return m;
	}
	@PostMapping("/update")
	public ModelAndView updateUser(@ModelAttribute("updateform") User user) {
		ModelAndView m = new ModelAndView("index");
		userServicesImpl.updateUser(user);
		m.addObject("users",userServicesImpl.getAllUserList());
		return m;
	}
	
}
