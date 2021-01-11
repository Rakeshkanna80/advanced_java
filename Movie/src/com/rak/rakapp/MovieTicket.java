package com.rak.rakapp;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

//@Disabled
class MovieTicket {

	//@Disabled
	@Test
	void test() {
		System.out.println("executing junit");
		Tester m = new Tester();
		String seats = m.bookSeats(2);
		System.out.println(seats);
		if (seats != null) {
			System.out.println(seats);
		}
		//assertEquals("success","odeya", m.bookSeats(5));
		
	}
	
	@Disabled
	@Test
	void unit() {
		Tester m = new Tester();
		//String seats = m.bookSeats(5);
		assertThrows(IllegalArgumentException.class, ()->{m.bookSeats(-1);});
	}
	

}
