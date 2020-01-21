package com.weathernotification.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.weathernotification.client.OpenWeatherMapClient;
import com.weathernotification.domain.WeatherDetails;
import com.weathernotification.service.SendWeatherReportNotificationService;

@RestController
public class WeatherDetailsResource {
	
	@Autowired
	OpenWeatherMapClient openWeatherMapClient;
	
	@Autowired
	private SendWeatherReportNotificationService weatherReportNotificationService;
	
	@GetMapping("api/weatherdetails")
	public ResponseEntity<WeatherDetails>  weatherReport(@RequestParam(name = "q") String location,
			@RequestParam(name = "appid") String appid){
		WeatherDetails weatherDetails = openWeatherMapClient.weatherReport(location, appid);
		Boolean status = false;
		if(null != weatherDetails) {
			status = weatherReportNotificationService.sendMessage(weatherDetails);
		}
		if(status) {
			return ResponseEntity.ok(weatherDetails);
		}
		return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).build();
	}

}
