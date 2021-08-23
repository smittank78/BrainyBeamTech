package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.bean.complainBean;
import com.dao.complainDao;

@WebServlet("/showComplain")
public class showComplainController extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		List<complainBean> listofComplain = new ArrayList<complainBean>();
		listofComplain = new complainDao().showComplain();
		complainBean bean = new complainBean();
		System.out.println("Controller Data :");
		System.out.println(bean.getId() + " | " + bean.getDate() +" | " + bean.getTitle() +" | " +  bean.getDetails() +" | " +  bean.getMobileNumber() +" | ");
		
		request.setAttribute("complain", listofComplain);
		request.getRequestDispatcher("showcomplain.jsp").forward(request, response);
	}

}
