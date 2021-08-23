package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.complainDao;

@WebServlet("/ComplainDeleteController")
public class ComplainDeleteController extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int Id = Integer.parseInt(request.getParameter("id"));
		System.out.println(Id);
		
		if(new complainDao().deleteComplain(Id))
		{
			System.out.println("complain deletd..");
			request.getRequestDispatcher("showComplain").forward(request, response);
		}
		else
		{
			response.sendRedirect("showComplain");
		}
	}
}