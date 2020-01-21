package com.weathernotification.constants;

public enum WeatherDetailsConstants {
	
	CLEAR("Clear", "clear sky");
	
	private final String main;
	private final String description;
	
	WeatherDetailsConstants(String main, String description){
		this.main = main;
		this.description = description;
	}
	
	
	public String getMain() {
		return main;
	}
	
	public String getDescription() {
		return description;
	}
	
	

}
