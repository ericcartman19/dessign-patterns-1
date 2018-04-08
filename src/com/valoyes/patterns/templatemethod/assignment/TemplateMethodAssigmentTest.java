package com.valoyes.patterns.templatemethod.assignment;

public class TemplateMethodAssigmentTest {

	public static void main(String[] args) {

		ComputerManufacturer desktopManufacturer = new DesktopManufacturer();
		desktopManufacturer.buildComputer();
		
		ComputerManufacturer laptopManufacturer = new LaptopManufacturer();
		laptopManufacturer.buildComputer();
		
	}

}
