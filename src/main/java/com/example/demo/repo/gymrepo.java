package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Gymdata;

public interface GymRepo extends JpaRepository<Gymdata, Integer> {

}
