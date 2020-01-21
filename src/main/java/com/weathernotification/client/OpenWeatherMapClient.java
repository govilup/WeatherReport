package com.weathernotification.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.weathernotification.config.FeignClientConfig;
import com.weathernotification.domain.WeatherDetails;

/**
 * Feign client to call the weather api
 * 
 * @author govilrajput
 *
 */
@FeignClient(value = "${feign.weathernotification.publish-client}", url = "${feign.weathernotification.url}", configuration = FeignClientConfig.class)
@Component
public interface OpenWeatherMapClient {

	@GetMapping(value = "data/2.5/weather")
	public WeatherDetails weatherReport(@RequestParam(name = "q") String q,
			@RequestParam(name = "appid") String appid);
}
