package com.currencycoverter;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CurrencyConverterServlet extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

	int amount = Integer.parseInt( req.getParameter("amount"));
	
	System.out.println("Amount + " + amount); 
	res.getWriter().println("Amount + "+amount);// it will not be visible because of next servlet's output
	
	//request dispatcher 

	req.setAttribute("amount", amount);
	RequestDispatcher rd = req.getRequestDispatcher("remote");
	rd.forward(req, res);
}

}
