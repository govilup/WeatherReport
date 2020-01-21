package com.weathernotification.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class MainDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1491100527644420497L;
	
	private Double temp;
	private Double pressure;
	private Double humidity;
	private Double temp_min;
	private Double temp_max;

}
