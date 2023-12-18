package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="gymdata")
public class gymdata {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
	private int roll;
	private String name;
	private String address;
	
	
	

}
