package com.weathernotification.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class Weather implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = -4017373632401767643L;
	
	private Long id;
	private String main;
	private String description;
	private String icon;

}
