package com.example.batch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.batch.model.UserDetails;

@Repository
public interface UserRepo extends JpaRepository<UserDetails, Integer> {


}
