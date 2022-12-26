package org.nagarro.dao;

import org.nagarro.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginDao extends CrudRepository<User, String> {
	User findByUsernameAndPassword(String username, String password);
}
