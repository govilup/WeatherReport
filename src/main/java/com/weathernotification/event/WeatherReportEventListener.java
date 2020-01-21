/*package com.weathernotification.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.weathernotification.client.OpenWeatherMapClient;
import com.weathernotification.domain.WeatherDetails;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class WeatherReportEventListener {
	
	@Autowired
	OpenWeatherMapClient openWeatherMapClient;
	
	@EventListener
	public void publishWeatherEvent(WeatherReportEvent event) {
		String q = null;
		String appid = null;
		WeatherDetails weatherReport = openWeatherMapClient.weatherReport(q, appid);
		if(weatherReport != null) {
			//Todo : throw an exception
		}
	}

}*/
