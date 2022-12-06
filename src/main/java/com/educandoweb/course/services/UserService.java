package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}

	public User findById(Long Id) {
		Optional<User> optional = repository.findById(Id);
		return optional.get();
	}

	public User insert(User user) {
		return repository.save(user);
	}

	public void delete(Long id) {
		repository.deleteById(id);
	}

	public User update(Long id, User updatedUser) {
		var user = repository.getReferenceById(id);
		updateData(user, updatedUser);
		return repository.save(user);
	}

	private void updateData(User user, User updatedUser) {
		user.setName(updatedUser.getName());
		user.setEmail(updatedUser.getEmail());
		user.setPhone(updatedUser.getPhone());
	}

}
