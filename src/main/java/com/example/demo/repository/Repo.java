package com.example.demo.repository;

/*import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import com.example.demo.model.RabbitModel;

public interface Repository extends JpaRepository<RabbitModel,String> {

}*/



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import com.example.demo.model.RabbitModel;


public interface Repo extends JpaRepository<RabbitModel, Integer>{
	

}