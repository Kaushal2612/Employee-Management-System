package com.db.employeemanagementsystem.service;

import com.db.employeemanagementsystem.bean.LoginBean;
import com.db.employeemanagementsystem.dao.LoginDAO;
import com.db.employeemanagementsystem.dao.LoginDAOImpl;

public class LoginServiceImpl implements LoginService{

	LoginDAO loginDAO = new LoginDAOImpl();
	@Override
	public boolean authenticate(LoginBean login) {
		// TODO Auto-generated method stub
		return loginDAO.authenticate(login);
	}
	
}
//servlet to service to dao to database
