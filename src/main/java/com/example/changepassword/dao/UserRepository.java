package com.example.changepassword.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.changepassword.enties.UserEntity;


@Repository
public interface  UserRepository extends JpaRepository<UserEntity,Long> {

}
