package com.valoyes.patterns.adapter;

public class WeatherUI {

	public void showTempterature(int zipcode) {
		
		// nos encontramos con el problema de la informacion provista no coincide 
		// con la que se solicita por el metier
		// WeatherFinder finder = new WeatherFinderImpl();
		// finder.find(city)
		
		WeatherAdapter adapter = new WeatherAdapter();
		System.out.println(adapter.findTemperature(zipcode));
	}
	
	public static void main(String[] args) {
		WeatherUI ui = new WeatherUI();
		ui.showTempterature(19406);
	}
}
