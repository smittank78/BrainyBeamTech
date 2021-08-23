package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.UserRegistrationBean;
import com.dao.userRegistrationDao;
import com.validation.validation;

@WebServlet("/UserRegistrationController")
public class UserRegistrationController extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String FirstName = request.getParameter("firstName");
		String MiddelName = request.getParameter("midelName");
		String LastName = request.getParameter("lastName");
		int sAge = Integer.parseInt(request.getParameter("studentAge"));
		String sBirthDate= request.getParameter("studentBirthDate");
		String sClg = request.getParameter("studentClg");
		String sClgState= request.getParameter("studentClgState");
		String sClgCity = request.getParameter("studentClgCity");
		int sClgPin = Integer.parseInt(request.getParameter("studentClgPincode"));
		String sGraduation = request.getParameter("graduation");
		String sDepartment = request.getParameter("studentDepartment");
		String sEmail= request.getParameter("studentEmail");
		String sPassword = request.getParameter("studentPassword");
		int sPhNum = Integer.parseInt(request.getParameter("studentPhNumber"));	
		
		HttpSession session = request.getSession();
		System.out.println("register --------> " + "session id : " + request.getRequestedSessionId());
		session.setAttribute("FirstName",FirstName);
		session.setAttribute("MiddelName",MiddelName);
		session.setAttribute("LastName",LastName);
		session.setAttribute("Age",sAge);
		session.setAttribute("BOD",sBirthDate);
		session.setAttribute("Clg",sClg);
		session.setAttribute("ClgState",sClgState);
		session.setAttribute("ClgCity",sClgCity);
		session.setAttribute("Graduation",sGraduation);
		session.setAttribute("Department",sDepartment);
		session.setAttribute("Email",sEmail);
		session.setAttribute("PhNumber",sPhNum);
		
		System.out.println(FirstName + "  " + MiddelName + "  " +  LastName + "  " +  sAge + "  " +  sBirthDate); 
		System.out.println(sClg + "  "+ sClgState + "  "+ "  "+ sClgCity + "  "+ sClgPin);
		System.out.println(sGraduation + "  "+ sDepartment + "  "+ sEmail + "  "+ sPassword + "  "+ sPhNum );
		UserRegistrationBean bean = new UserRegistrationBean();
		bean.setFirstName(FirstName);
		bean.setLastName(LastName);
		bean.setMidelName(MiddelName);
		bean.setsAge(sAge);
		bean.setsBirthDate(sBirthDate);
		bean.setsClg(sClgCity);
		bean.setsClgState(sClgState);
		bean.setsClgCity(sClgCity);
		bean.setsClgPin(sClgPin);
		bean.setsGraduation(sGraduation);
		bean.setsDepartment(sDepartment);
		bean.setsEmail(sEmail);
		bean.setsPassword(sPassword);
		bean.setsPhNum(sPhNum);

		PrintWriter ot = response.getWriter();
		
		if(new validation().RegistrationValidation())
		{
			ot.println("<html><body>");
			ot.println("<font color=red>invalid activity at register page</font>");
	   		ot.println("</body></html>");
			request.getRequestDispatcher("login.jsp").include(request, response);
		}
		else
		{
			if(new userRegistrationDao().userRegistration(bean))
			{	
				System.out.println("data entry sucessfull");
				request.getRequestDispatcher("home.jsp").include(request, response);
			}
			else
			{
				System.out.println("data not entered");
				ot.println("data not inserted");
				request.getRequestDispatcher("register.jsp").include(request, response);
			}
		}
	}
}