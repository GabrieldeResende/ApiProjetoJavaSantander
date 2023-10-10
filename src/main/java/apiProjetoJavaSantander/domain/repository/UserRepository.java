package apiProjetoJavaSantander.domain.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import apiProjetoJavaSantander.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	boolean existsByAccountNumber(String accountNumber);
}
