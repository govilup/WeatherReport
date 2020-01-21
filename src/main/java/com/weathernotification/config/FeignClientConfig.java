package com.weathernotification.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import feign.codec.ErrorDecoder;

@Configuration
public class FeignClientConfig {
	
	@Bean
	@Primary
	ErrorDecoder errorDecoder() {
		return new CustomErrorDecoder();
	}

}
