package in.pwskills.akash.service;

import in.pwskills.akash.entity.User;

public interface IUserService {
	
	//save into db(during signin)
	public Integer saveUser(User user);
	
	//when logging wiht username and password check whether user if found or not 
	public User findByUsername(String username);

}
