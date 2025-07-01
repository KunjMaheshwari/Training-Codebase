package AnnotationPractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * TC1 →
1. Login ———————> @BeforeMethod
2. Search ———————> @Test
3. Logout ———————> @AfterMethod
4. Login
5. Advance Search ————> @Test
6. Logout
 */

public class Practice01 {
	
	@BeforeMethod
	void login(){
		System.out.println("This is login..");
	}
	
	
	@Test(priority=1)
	void search() {
		System.out.println("This is search..");
	}
	
	@Test(priority=2)
	void advanceSearch() {
		System.out.println("This is Advance Search..");
	}
	
	@AfterMethod
	void logout() {
		System.out.println("This is logout..");
	}
}
