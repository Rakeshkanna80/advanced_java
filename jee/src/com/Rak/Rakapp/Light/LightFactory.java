package com.Rak.Rakapp.Light;

public class LightFactory {
	// object creation logic
	public static Iswitch getLight(String type) {
		if (type.equalsIgnoreCase("tubelight")) {
			return new TubeLightImpl();

		}

		else if (type.equalsIgnoreCase("ledlight")) {
			return new LedLightImpl();

		}
		else {
			System.out.println("no light found");
		}

		return null;

	}

}
