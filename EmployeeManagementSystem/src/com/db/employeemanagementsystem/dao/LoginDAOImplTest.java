package com.db.employeemanagementsystem.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.db.employeemanagementsystem.bean.LoginBean;

class LoginDAOImplTest {

	@Test
	void testAuthenticate() {
		LoginBean loginBean = new LoginBean("admin", "root");
		Assertions.assertEquals(true, new LoginDAOImpl().authenticate(loginBean), "Checking the credential");
	}

}
