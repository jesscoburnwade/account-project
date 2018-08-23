package org.qa.account_project.service;
import java.util.HashMap;
import java.util.Map;

import org.qa.account_project.domain.*;

public class AddingAndRecieving {
	
	private Map<Integer, Accounts> accountsMap;
	private Integer counter = 1;
	
	public AddingAndRecieving() {
		accountsMap = new HashMap<Integer, Accounts>();
	}
	
	public void addingAccounts(Accounts accountToAdd) {
		accountsMap.put(counter, accountToAdd);
		counter++;
	}
	
	public void gettingAccounts(Accounts accountToGet) {
		accountsMap.get(counter);
	}

}
