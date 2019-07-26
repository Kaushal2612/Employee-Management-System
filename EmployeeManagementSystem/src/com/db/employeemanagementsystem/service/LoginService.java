package com.db.employeemanagementsystem.service;

import com.db.employeemanagementsystem.bean.LoginBean;

public interface LoginService {
	public boolean authenticate(LoginBean login);
}
