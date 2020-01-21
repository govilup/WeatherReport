package com.weathernotification.domain;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * Weather details domain object.
 * 
 * @author govilrajput
 *
 */
@Data
public class WeatherDetails implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 5039331671549243547L;

	private Coordinate coord;
	private List<Weather> weather;
	private String base;
	private MainDetails main;
	private Double visibility;
	private WindDetails wind;
	private CloudInfo clouds;

	// Unix time, UTC (Time of data calculation)
	private Long dt;
	private SystemDetails sys;
	private Long id;
	//City/Location Name
	private String name;
	// Some internal parameter
	private Integer cod;

}
