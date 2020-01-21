package com.weathernotification.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class CloudInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4791668180930284678L;
	
	private Integer clouds;

}
