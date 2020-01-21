package com.weathernotification.service;

import org.springframework.stereotype.Service;

import com.google.common.base.Preconditions;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.Message.Status;
import com.twilio.type.PhoneNumber;
import com.weathernotification.constants.WeatherDetailsConstants;
import com.weathernotification.domain.Weather;
import com.weathernotification.domain.WeatherDetails;

@Service
public class SendWeatherReportNotificationServiceImpl implements SendWeatherReportNotificationService {

	public static final String ACCOUNT_SID = "";

	public static final String AUTH_TOKEN = "";

	@Override
	public Boolean sendMessage(WeatherDetails weatherDetails) {
		Preconditions.checkNotNull(weatherDetails, "WeatherDetails should not be null.");
		Boolean status = triggerMessageSending(weatherDetails);
		if(status) {
			return status;
		}
		return false;
	}

	private boolean triggerMessageSending(WeatherDetails weatherDetails) {
		Message message;
		for (Weather weather : weatherDetails.getWeather()) {
			String weatherDescription = null;
			weatherDescription = weatherDescription(weather);
			message = sendSMS(weatherDescription);
			if(null != message & Status.DELIVERED.equals(message.getStatus().DELIVERED)) {
				return true;
			}
		}
		return false;
	}

	private String weatherDescription(Weather weather) {
		String weatherDescription;
		if (weather.getMain().equals(WeatherDetailsConstants.CLEAR.getMain())) {
			weatherDescription = "Sky is clear today no need of Umberella.";
		} else {
			weatherDescription = "Sky is not clear today please take your Umberella.";
		}
		return weatherDescription;
	}

	private Message sendSMS(String weatherDescription) {
		Message message;
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		message = Message
				.creator(new PhoneNumber(""), new PhoneNumber("+"), weatherDescription)
				.create();
		return message;
	}

}
