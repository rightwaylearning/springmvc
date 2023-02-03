package rwl.save.data.controller.beans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	private static List<User> list = new ArrayList<>();
	
	public void saveUser(String userName, String password) {
		list.add(new User(userName, password));
	}
	
	public void saveUserObject(User user) {
		list.add(user);
	}
	
	public List<User> getAllUserLoginInfo(){
		return list;
	}
}
