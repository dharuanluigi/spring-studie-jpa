package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User;

// @Repository -> its optional because JPA already do it
public interface UserRepository extends JpaRepository<User, Long> {

}
