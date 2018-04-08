package com.valoyes.patterns.templatemethod.assignment;

public class DesktopManufacturer extends ComputerManufacturer{

	@Override
	HardDiskTypeEnum addHardDisk() {
		System.out.println("Las desktop computer las construimos con " + HardDiskTypeEnum.PATA);
		return HardDiskTypeEnum.PATA;
	}

	@Override
	RAMTypeEnum addRAM() {
		System.out.println("Las desktop computer las construimos con " + RAMTypeEnum.DDR_SDRAM);
		return RAMTypeEnum.DDR_SDRAM;
	}

	@Override
	KeyBoardTypeEnum addKeyBoard() {
		System.out.println("Las desktop computer las construimos con " + KeyBoardTypeEnum.ESP);
		return KeyBoardTypeEnum.ESP;
	}

}
