package org.qa.account_project;
import org.qa.account_project.domain.*;
import org.qa.account_project.service.*;

public class AccountApp {
	public static void main(String [] args) {
//		System.out.println("Hello world");
		
		AddingAndRecieving addOrGetAccount = new AddingAndRecieving();
		Accounts john = new Accounts("John", "Smith", 1234);
		
		addOrGetAccount.addingAccounts(john);
		addOrGetAccount.gettingAccounts(john);
	}
}
