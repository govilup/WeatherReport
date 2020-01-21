package com.weathernotification.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class WindDetails implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5665466248908208880L;
	
	private Double speed;
	private Double degree;
	
}
