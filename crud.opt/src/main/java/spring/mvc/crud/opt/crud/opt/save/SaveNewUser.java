package spring.mvc.crud.opt.crud.opt.save;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.crud.opt.crud.opt.model.User;
import spring.mvc.crud.opt.crud.opt.services.UserServicesImpl;

@RestController
public class SaveNewUser {

	@Autowired
	UserServicesImpl userServicesImpl;

	@GetMapping("/addform")
	public ModelAndView showForm() {
		ModelAndView m = new ModelAndView("addForm");
		return m;
	}

	@PostMapping("/save")
	public ModelAndView saveUser(@ModelAttribute("form123") User user) {
		System.out.println(user);
		if (user.getUserId() != null) {
			userServicesImpl.saveUser(user);
		}
		ModelAndView m = new ModelAndView("index");
		m.addObject("users",userServicesImpl.getAllUserList());
		return m;
	}

}
