package com.shell.autowiring;

public class AutoWiringService {
	private AutoWiringDAO autoWiringDAO;
	
	/**
	 * @param autoWiringDAO the autoWiringDAO to set
	 */
	public void setAutoWiringDAO(AutoWiringDAO autoWiringDAO) {
		System.out.println("setter method");
		this.autoWiringDAO = autoWiringDAO;
	}
	
	public AutoWiringService() {
		System.out.println("default constructor");
	}
	
	public AutoWiringService(AutoWiringDAO autoWiringDAO) {
		System.out.println("constructor method");
		this.autoWiringDAO = autoWiringDAO;
	}
	
	public void dao(String word) {
		autoWiringDAO.dao(word);
	}
}
