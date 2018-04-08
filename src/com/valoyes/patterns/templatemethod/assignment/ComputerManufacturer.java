package com.valoyes.patterns.templatemethod.assignment;

public abstract class ComputerManufacturer {

	void buildComputer() {
		
		System.out.println("Building computer... ");
		addHardDisk();
		addRAM();
		addKeyBoard();
		
	}
	
	abstract HardDiskTypeEnum addHardDisk();
	
	abstract RAMTypeEnum addRAM();
	
	abstract KeyBoardTypeEnum addKeyBoard();
	
}
