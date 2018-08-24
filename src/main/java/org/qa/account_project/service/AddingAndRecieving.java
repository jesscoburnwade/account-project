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
	
	public Map<Integer, Accounts> returnMap() {
		return accountsMap;
	}

	public int getNumberofAccouuntsWithThisName(String firstName) {
		int counter = 0;
		for (Accounts account : accountsMap.values()) {
			if (account.getFirstName().equals(firstName)) {
				counter++;
			}
		}
		return counter;
	}

}
