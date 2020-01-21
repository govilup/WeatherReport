package com.weathernotification.scheduler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.weathernotification.dto.QueryParams;

import lombok.extern.slf4j.Slf4j;

/**
 * Scheduler to trigger and event to call the weather api
 * 
 * @author govilrajput
 *
 */
@Component
@Slf4j
public class WeatherDetailsScheduler {

	//@Autowired
	//private WeatherReportEventPublisher weatherReportEventPublisher;
	
	@Value("${weatherreport.key}")
	private String key;

	// ToDo : add the cron expression to the application.properties file
	// then get it here using ${}
	@Scheduled(cron = "${cron.expression.weatherDetailsScheduler}")
	public void generateWeatherReport() {
		QueryParams queryParams = new QueryParams();
		queryParams.setLocation("London");
		queryParams.setAppId("0f5a1c8f73bda742af1d4cd805f4ea00");
		//weatherReportEventPublisher.doStuffAndPublishEvent(queryParams);
	}

}
