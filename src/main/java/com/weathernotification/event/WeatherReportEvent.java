/*package com.weathernotification.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

import com.weathernotification.dto.QueryParams;

import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@EqualsAndHashCode(callSuper = false)
public class WeatherReportEvent extends ApplicationEvent{

	private static final long serialVersionUID = -7643381819914897005L;
	
	QueryParams queryParams;

	public WeatherReportEvent(Object source, QueryParams queryParams) {
		super(source);
		this.queryParams = queryParams;
		log.info("A new weather report event is generated.");
	}

}*/
