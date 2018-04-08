package com.valoyes.patterns.templatemethod.assignment;

public class LaptopManufacturer extends ComputerManufacturer{

	@Override
	HardDiskTypeEnum addHardDisk() {
		System.out.println("Las laptop computer las construimos con " + HardDiskTypeEnum.SSD);
		return HardDiskTypeEnum.SSD;
	}

	@Override
	RAMTypeEnum addRAM() {
		System.out.println("Las laptop computer las construimos con " + RAMTypeEnum.SRAM);
		return RAMTypeEnum.SRAM;
	}

	@Override
	KeyBoardTypeEnum addKeyBoard() {
		System.out.println("Las laptop computer las construimos con " + KeyBoardTypeEnum.ENG);
		return KeyBoardTypeEnum.ENG;
	}

}
