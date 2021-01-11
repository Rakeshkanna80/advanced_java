package com.rak.rakapp;

public class Tester {

	public static void main(String[] args) {
		Tester m = new Tester();
		String seats = m.bookSeats(5);
		System.out.println(seats);
		if (seats != null) {
			System.out.println(seats);
		}

	}

	String movieName = "odeya";

	public String bookSeats(int noOfSeats) {

		if (noOfSeats < 1) {
			throw new IllegalArgumentException();
		}
		return movieName;
	}

}