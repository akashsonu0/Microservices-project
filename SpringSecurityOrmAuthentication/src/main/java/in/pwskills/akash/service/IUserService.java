package in.pwskills.akash.service;

import java.util.Optional;

import in.pwskills.akash.entity.User;

public interface IUserService {
	Integer saveUser(User user);
	Optional<User> getOneUser(Integer id);

}
