package com.Rak.Rakapp.Light;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the light");
		String type=sc.next();
		//consumer or utilization logic
		Iswitch iswitch=LightFactory.getLight(type);
		if(iswitch!=null) {
			iswitch.sOn();
			iswitch.sOff();
			
		}
	}

}
