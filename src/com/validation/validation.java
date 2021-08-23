package com.validation;

import com.bean.UserRegistrationBean;
import com.bean.complainBean;
import com.bean.loginBean;

public class validation
{
	public static boolean loginValidation()
	{
		boolean flag = false;
		loginBean bean = new loginBean();
		String email  = bean.getEmail();
		String pass = bean.getPass();
		
		if(email == null || email == "" || email.trim().length() <= 0 && pass == null || pass == "" || pass.trim().length() <= 0 )		{
			{
				flag = true;
			}
		}
		return flag;
	}
	public static boolean RegistrationValidation()
	{
		boolean flag=false;
		UserRegistrationBean bean = new UserRegistrationBean();
		String fName = bean.getFirstName();
		String mName = bean.getMidelName();
		String lName = bean.getLastName();
		String sClg = bean.getsClg();
		String sClgState = bean.getsClgState();
		String sClgCity= bean.getsClgCity();
		String sGraduation = bean.getsGraduation();
		String sEmail = bean.getsEmail();
		String sPass = bean.getsPassword();
		if(fName == null || fName == "" || fName.trim().length() <= 0 && mName == null || mName == "" || mName.trim().length() <= 0 && lName == null || lName == "" || lName.trim().length() <= 0)
		{
				if(sClg == null || sClg == "" || sClg.trim().length() <= 0 && sClgState == null || sClgState == "" || sClgState.trim().length() <= 0 && sClgCity == null || sClgCity == "" || sClgCity.trim().length() <= 0)
				{
					if(sGraduation  == null ||sGraduation  == "" ||sGraduation .trim().length() <= 0 && sEmail == null || sEmail == "" || sEmail.trim().length() <= 0 && sPass == null || sPass  == "" || sPass.trim().length() <= 0)
					{
						flag = true;
					}
				}
		}
		return flag;
	}
	
	public boolean ComplainValidationvalidation()
	{
		boolean flag = false;
		complainBean bean = new complainBean();
		String add = (String)bean.getAdd();
		String date = (String)bean.getDate();
		String detail = (String)bean.getDetail();
		String title = (String)bean.getTitle();
		String mobileNumber =(String)bean.getMobileNumber();
		System.out.println("validate"  + title + "  " + detail + "  " + add + "  " + mobileNumber + "  " + date);

		if(title == null || title == "" || title.trim().length() <= 0 || detail == null || detail == "" || detail.trim().length() <= 0 || add == null || add == "" || add.trim().length() <= 0 || mobileNumber == null || mobileNumber == "" || mobileNumber.trim().length() <= 0 || date == null || date == "" || date.trim().length() <= 0)	
		{
			flag = true;
			System.out.println("true");
		}
		return flag;
	}
}
 