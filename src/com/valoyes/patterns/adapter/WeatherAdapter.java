package com.valoyes.patterns.adapter;

/**
 * Clase que implementa el "Adapter pattern"
 * @author benito
 *
 */
public class WeatherAdapter {

	public int findTemperature(int zipcode) {
		String city = null;
		
		if(zipcode == 19406) {
			city = "King of Prusia, PA";
		}
		
		WeatherFinder finder = new WeatherFinderImpl();
		int temperature = finder.find(city);
		return temperature;
	}
}
