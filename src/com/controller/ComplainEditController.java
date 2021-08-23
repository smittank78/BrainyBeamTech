package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.complainBean;
import com.dao.complainDao;

@WebServlet("/ComplainEditController")
public class ComplainEditController extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		int Id = Integer.parseInt(request.getParameter("id"));
		System.out.println("-----------ComplainEditController---------------");
		
		complainBean bean = new complainDao().editComplain(Id);
		String title = (String)bean.getTitle();
		String date = (String)bean.getDate();
		String detail = (String)bean.getDetails();
		String mnum = (String)bean.getMobileNumber();
		String add = (String)bean.getAddress();
		System.out.println(title + detail + date + mnum + add);
		request.setAttribute("EditDetail", bean);
		request.setAttribute("Title", title);
		request.setAttribute("Date", date);
		request.setAttribute("Detail", detail);
		request.setAttribute("Mnum", mnum);
		request.setAttribute("Id", Id);
		request.setAttribute("Add", add);
		request.getRequestDispatcher("edit.jsp").forward(request, response);
	}

	}