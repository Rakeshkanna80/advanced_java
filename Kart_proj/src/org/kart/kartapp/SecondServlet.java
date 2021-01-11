package org.kart.kartapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ss")
public class SecondServlet extends HttpServlet {
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String prodName=(String)req.getAttribute("prodName");
		String prodQuantity=(String)req.getAttribute("prodQuantity");
		
		
		int pq=Integer.parseInt(prodQuantity);
		double price=1000.00;
		
		double total=pq*price;
		
		ServletOutputStream out=resp.getOutputStream();
		out.println("Thankyou for clicking the submit button : your total price is="+total);
	}
}
