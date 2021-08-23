package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.FeedBackBean;
import com.dao.FeedBackDao;

@WebServlet("/FeedbackController")
public class FeedbackController extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String Title = request.getParameter("fTitle");
		String Des = request.getParameter("fDes");
		String Date = request.getParameter("fDate");
		String Ex = request.getParameter("fExperience");
		String Sug = request.getParameter("fSuggestion");
				
		System.out.println("Feed-Back ---------- >" + Title + "  " + Date + "  " + Des  + "  " + Ex + "  " + Sug);
				
		FeedBackBean bean = new FeedBackBean();
		bean.setDate(Date);
		bean.setDes(Des);
		bean.setEx(Ex);
		bean.setSug(Sug);
		bean.setTitle(Title);
		
		if(new FeedBackDao().addFeedBack(bean))
		{
			System.out.println("FeedBack received sucessfully");
			request.getRequestDispatcher("home.jsp").forward(request, response);
		}
		else
		{
			System.out.println("FeedBack not Received");
		}
	}
}
 