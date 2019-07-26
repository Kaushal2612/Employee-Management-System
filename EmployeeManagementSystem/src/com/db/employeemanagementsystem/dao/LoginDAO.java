package com.db.employeemanagementsystem.dao;

import com.db.employeemanagementsystem.bean.LoginBean;

public interface LoginDAO {
	public boolean authenticate(LoginBean login);
	
}
