package com.Rak.Rakapp.Light;

public class LedLightImpl implements Iswitch {

	@Override
	public void sOn() {
		System.out.println("Ledlight turned on");
	}

	@Override
	public void sOff() {
		System.out.println("Ledlight turned off");
	}

}
