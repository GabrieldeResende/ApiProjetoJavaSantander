package apiProjetoJavaSantander.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import apiProjetoJavaSantander.domain.model.User;
import apiProjetoJavaSantander.domain.repository.UserRepository;
import apiProjetoJavaSantander.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	
	private final UserRepository userRepository = null;

	@Override
	public User findById(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
	}

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This Account number already exists.");
        }
        return userRepository.save(userToCreate);
    }
}
