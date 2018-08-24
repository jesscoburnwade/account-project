package org.qa.account_project;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.qa.account_project.domain.Accounts;
import org.qa.account_project.service.AddingAndRecieving;

import junit.framework.Assert;
import junit.framework.TestCase;

public class AccountAppTest {
	
	AddingAndRecieving noAcc = new AddingAndRecieving();
	
	@Before
	public void setup() {		
		Accounts john = new Accounts("John", "Smith", 1234);
		Accounts joe = new Accounts("Joe", "Bloggs", 1235);
		Accounts doe = new Accounts("John", "Doe", 1236);
		
		noAcc.addingAccounts(john);
		noAcc.addingAccounts(joe);
		noAcc.addingAccounts(doe);
	}
	
	@Test
	public void testCountName() {
		int actualNumber = noAcc.getNumberofAccouuntsWithThisName("John");
		System.out.println(actualNumber);
		assertEquals(2, actualNumber);
	}

}
