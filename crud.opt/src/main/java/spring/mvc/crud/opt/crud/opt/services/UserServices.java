package spring.mvc.crud.opt.crud.opt.services;

import java.util.List;

import spring.mvc.crud.opt.crud.opt.model.User;

public interface UserServices {

	public List<User> getAllUserList();
	public void updateUser(User user);
	public void deleteUser(Integer userId);
	public void saveUser(User user);
}
