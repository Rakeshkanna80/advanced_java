package org.rak.rakapp;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/Zomato")
public class ZomatoServlet extends GenericServlet {

	public ZomatoServlet() {
		System.out.println("servlet object is collected");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init() throws ServletException {
		System.out.println("initializing");
		super.init();
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String hotelName = req.getParameter("hotelName");
		String location = req.getParameter("location");
		String item = req.getParameter("item");
		String price = req.getParameter("price");

		System.out.println(hotelName + " " + location + " " + item + " " + price);

	}

}
