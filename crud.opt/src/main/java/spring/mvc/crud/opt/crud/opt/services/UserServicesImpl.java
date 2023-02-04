package spring.mvc.crud.opt.crud.opt.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import spring.mvc.crud.opt.crud.opt.model.User;

@Service
public class UserServicesImpl implements UserServices{
	
	private static List<User> userList;
	
	public UserServicesImpl() {
		userList = new ArrayList<>();
		userList.add(new User(1, "Sahil", "Bagade", 21, "Male", "1233"));
		userList.add(new User(2, "Mahesh", "Jadhav", 22, "Male", "3847658"));
		userList.add(new User(3, "Shital", "Patil", 20, "Female", "shital@123"));

	}

	@Override
	public List<User> getAllUserList() {
		return userList;
	}

	@Override
	public void updateUser(User user) {
		for(int i =0 ;i < userList.size() ; i++) {
			if(userList.get(i).getUserId().equals(user.getUserId())) {
				userList.get(i).setFirstName(user.getFirstName());
				userList.get(i).setLastName(user.getLastName());
				userList.get(i).setAge(user.getAge());
				userList.get(i).setGender(user.getGender());
				break;
			}
		}
		
	}

	@Override
	public void deleteUser(Integer userId) {
		for(int i =0 ;i < userList.size() ; i++) {
			if(userList.get(i).getUserId().equals(userId)) {
				userList.remove(i);
				break;
			}
		}
		
	}

	@Override
	public void saveUser(User user) {
		userList.add(user);
	}

	@Override
	public User getUser(Integer userId) {
		for(int i =0 ;i < userList.size() ; i++) {
			if(userList.get(i).getUserId().equals(userId)) {
				return userList.get(i);
			}
		}
		return null;
	}

}
