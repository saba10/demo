package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.domain.EntityScan;



@Entity
public class RabbitModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int a;
	
	
	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	private String list;

	public String getList() {
		return list;
	}


	public void setList(String list) {
		this.list = list;
	}


	/*public RabbitModel saverabbit(RabbitModel rabbitModel) {
		// TODO Auto-generated method stub
		return rabbitModel;
	}*/

}
