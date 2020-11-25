package com.yedam.interfaces;

public class RemoteControlExample {

	public static void main(String[] args) {
		Audio audio = new Audio();
		Television tv = new Television();

//		audio.turnOn();
//		audio.turnOff();

//		tv.turnOn();
//		tv.turnOff();

		RemoteControl rc = audio;
		rc.turnOn();
		rc.turnOff();

		rc = tv;
		rc.turnOn();
		rc.turnOff();
	}

}
