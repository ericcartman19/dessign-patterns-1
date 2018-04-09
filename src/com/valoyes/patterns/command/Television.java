package com.valoyes.patterns.command;

/**
 * Clase ejerce de "Receiver" dentro del patron
 * 
 * @author benito
 *
 */
public class Television {

	public void on() {
		System.out.println("Television switched on");
	}
	
	public void off() {
		System.out.println("Television switched off");
	}
	
}
