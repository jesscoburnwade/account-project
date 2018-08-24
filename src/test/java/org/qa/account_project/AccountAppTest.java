package org.qa.account_project;

import static org.junit.Assert.*;

import org.junit.Test;
import org.qa.account_project.domain.Accounts;
import org.qa.account_project.service.AddingAndRecieving;

import junit.framework.Assert;
import junit.framework.TestCase;

public class AccountAppTest {
	
		@Test
		public void testCountName() {
			AddingAndRecieving noAcc = new AddingAndRecieving();
			
			Accounts john = new Accounts("John", "Smith", 1234);
			Accounts joe = new Accounts("Joe", "Bloggs", 1235);
			Accounts doe = new Accounts("John", "Doe", 1236);
			
			noAcc.addingAccounts(john);
			noAcc.addingAccounts(joe);
			noAcc.addingAccounts(doe);

			int actualNumber = noAcc.getNumber("John");
			assertEquals(2, actualNumber);
		}
	
}
