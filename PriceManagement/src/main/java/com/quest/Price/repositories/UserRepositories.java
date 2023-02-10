package com.quest.Price.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quest.Price.models.User;

public interface UserRepositories extends JpaRepository<User, Long>  {

}
