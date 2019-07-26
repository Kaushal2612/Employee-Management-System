package com.db.employeemanagementsystem.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DBUtilTest {

	@Test
	void testGetConnection() {
		Assertions.assertNotNull(DBUtil.getConnection());
	}

	
}
