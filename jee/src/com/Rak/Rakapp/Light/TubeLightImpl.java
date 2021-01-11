package com.Rak.Rakapp.Light;

public class TubeLightImpl implements Iswitch {
//Implementation logic
	@Override
	public void sOn() {
		System.out.println("tubelight turned on");
	}

	@Override
	public void sOff() {
		System.out.println("tubelight turned off");
	}
	

}
