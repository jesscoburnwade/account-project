package org.qa.account_project;
import java.util.Map;

import org.json.JSONObject;
import org.qa.account_project.domain.*;
import org.qa.account_project.service.*;

public class AccountApp {
	public static void main(String [] args) {
//		System.out.println("Hello world");
		
		AddingAndRecieving addOrGetAccount = new AddingAndRecieving();
		Accounts john = new Accounts("John", "Smith", 1234);
		Accounts joe = new Accounts("Joe", "Bloggs", 1235);
		
		Map<Integer, Accounts> printMap = addOrGetAccount.returnMap();
		addOrGetAccount.addingAccounts(john);
		addOrGetAccount.addingAccounts(joe);
		addOrGetAccount.gettingAccounts(john);
		
		JSONObject json = new JSONObject(printMap);
		System.out.println(json);
	}
}