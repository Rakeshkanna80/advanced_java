package org.kart.kartapp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fs")
public class FirstServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String ProductName = req.getParameter("pn");
		String ProductQuantity = req.getParameter("pq");

		req.setAttribute("prodName", ProductName);
		req.setAttribute("prodQuantity", ProductQuantity);

		RequestDispatcher dispatcher = req.getRequestDispatcher("ss");
		dispatcher.forward(req, resp);
	}
}
