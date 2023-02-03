package rwl.save.data.controller.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AddUserHandler {
	
	@Autowired
	UserService userService;
	
	// http://localhost:8080/
	@GetMapping("/")
	public ModelAndView homePage() {
		ModelAndView m = new ModelAndView("index");
		return m;
	}
	
	// http://localhost:8080/addUser

	@PostMapping(value="/addUser")
	public ModelAndView saveUserData( @ModelAttribute("test") User user) {
		//userService.saveUser(userName, userPassword);
		userService.saveUserObject(user);
		System.out.println(user);
		List<User> userList = userService.getAllUserLoginInfo();
		
		ModelAndView m = new ModelAndView("success");
		m.addObject("userList",userList);
		return m;
	}
}
