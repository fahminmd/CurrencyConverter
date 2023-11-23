package com.currencycoverter;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CurrencyConverterRemoteCallServlet extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {

		double usd = Double.parseDouble( req.getParameter("amount"));
		
		// guess here is API call is happening 
		double cadAmount = usd*1.37;
		
		res.getWriter().println("CAD amount is  :  "+ cadAmount);
	}
}
