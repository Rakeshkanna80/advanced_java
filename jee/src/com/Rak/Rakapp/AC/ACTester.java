package com.Rak.Rakapp.AC;

public class ACTester {

	public static void main(String[] args) {
		LGimpl imp = ACFactory.getAC("LG");
		imp.turnOn();
		imp.turnOff();
		Samsungimpl imp2=ACFactory.getAC2("Samsung");
		imp2.turnOn();
		imp2.turnOn();
	}
}

interface IRemote {
	void turnOn();

	void turnOff();
}

class LGimpl implements IRemote {

	@Override
	public void turnOn() {
		System.out.println("LGAc turned on");
	}

	@Override
	public void turnOff() {
		System.out.println("LGAc turned off");

	}
}

class Samsungimpl implements IRemote {
	@Override
	public void turnOff() {
		System.out.println("Sam Ac turned off");

	}

	@Override
	public void turnOn() {
		System.out.println("Sam Ac turned on");

	}

}

class ACFactory {
	public static LGimpl getAC(String type) {
		if (type.equalsIgnoreCase("LG")) {
			return new LGimpl();
		} else {
			return null;
		}
	}

	public static Samsungimpl getAC2(String type) {
		if (type.equalsIgnoreCase("samsung")) {
			return new Samsungimpl();
		} else {
			return null;
		}

	}
}
