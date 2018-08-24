package org.qa.account_project;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;

public class AccountAppTest {
	
		@Test
		public void testCountName() {
			AccountApp accounts = new AccountApp();
			int actualNumber = accounts.getNumber("John");
			assertEquals(2, actualNumber);
		}
	
}
