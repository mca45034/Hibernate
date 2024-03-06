package com.rays.junit;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import junit.framework.TestCase;

public class TestAssertNull extends TestCase{
	@Test
	public void testFindByPk() throws Exception {

		UserBean bean = UserModel.findByPk(11);

		//assertNull("user is null", bean);
		 assertTrue(bean == null);

	}

}
