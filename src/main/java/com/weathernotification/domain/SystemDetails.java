package com.weathernotification.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class SystemDetails implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3954554121938290439L;
	
	private Integer type;
	private Long id;
	private Double message;
	private String country;
	private Long sunrise;
	private Long sunset;

}
