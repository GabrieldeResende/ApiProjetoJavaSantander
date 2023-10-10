package apiProjetoJavaSantander.service;

import apiProjetoJavaSantander.domain.model.User;

public interface UserService {
	User findById(Long id);
	
	User create(User userToCreate);
}
