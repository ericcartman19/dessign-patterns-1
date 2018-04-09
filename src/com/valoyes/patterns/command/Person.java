package com.valoyes.patterns.command;

public class Person {

	public static void main(String[] args) {
		
		// receiver
		Television television = new Television();
		// invoker
		RemoteControl remoteControl = new RemoteControl();
		// instance of Command
		OnCommand onCommand = new OnCommand(television);
		remoteControl.setCommand(onCommand);
		// invoke the attribute on the selected command
		remoteControl.pressButton();
		
		OffCommand offCommand = new OffCommand(television);
		remoteControl.setCommand(offCommand);
		remoteControl.pressButton();
		
	}
}
