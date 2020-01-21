package com.weathernotification.service;

import org.springframework.stereotype.Service;

import com.weathernotification.domain.WeatherDetails;

@Service
public interface SendWeatherReportNotificationService {
	
	Boolean sendMessage(WeatherDetails weatherDetails);

}
