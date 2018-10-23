package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.RabbitModel;
import com.example.demo.repository.Repo;


@RestController
public class  Controller  {
	
    @Autowired
	Repo repo;
	
	/*@Autowired
	public Controller(Repo repo) {
		super();
		this.repo = repo;
	}*/
	

	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public void saverabbit(@RequestBody RabbitModel rabbitModel) {
		
		repo.save(rabbitModel);
		}

	
		
	/* @RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResponseEntity<?> saverabbit(@RequestBody RabbitModel rabbitModel) {
		RabbitModel savedrabbit=rabbitModel.saverabbit(rabbitModel);
		return new ResponseEntity<RabbitModel>(savedrabbit, HttpStatus.CREATED);
		
		
	}*/

}
