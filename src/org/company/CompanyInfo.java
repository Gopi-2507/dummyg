package org.company;

public class CompanyInfo {

	private void companyName() {
	System.out.println("Comp Name: ABC Company");
	
	}
	private void companyId() {
	System.out.println("Company ID: 1234ABC");
	}
	
	private void companyAddress() {
		System.out.println("Company Address: No 1, 1st Street, Chennai.");

	}
	public static void main(String[] args) {
		CompanyInfo compName = new CompanyInfo();
		compName.companyName();
		compName.companyId();
		compName.companyAddress();
	
	}
	

	
}
