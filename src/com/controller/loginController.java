package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionIdListener;

import com.bean.loginBean;
import com.dao.loginDao;
import com.validation.validation;

@WebServlet("/loginController")
public class loginController extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
			String email = request.getParameter("email");
			String pass = request.getParameter("password");
			PrintWriter out = response.getWriter();
	   
			System.out.println(email  + " ::     ::   " + pass + "          " );
			loginBean bean = new loginBean();
			bean.setEmail(email);
			bean.setPass(pass);
			HttpSession session = request.getSession();
			session.setAttribute("Email", email);
			session.setAttribute("Pass", pass);
			System.out.println("login --> " +"session id : " + request.getRequestedSessionId());
			PrintWriter ot = response.getWriter();
		
			if(new validation().loginValidation())
			{
				out.println("<html<body><font size=10px color=red><marquee>UserName and Password is Null<</marquee></font></body></html>");
				request.getRequestDispatcher("login.jsp").include(request, response);
			}
			else
			{
				if(new loginDao().login(bean))
				{
					System.out.println("data inserted");
					request.getRequestDispatcher("register.jsp").forward(request, response);
				}
				else
				{
					ot.println("data not inserted");
					response.sendRedirect("logn.jsp");
				}
			}
		}
	}