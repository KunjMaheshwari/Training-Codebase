package AnnotationPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*
 * TC2
 * 
 *1. Login  -------------> @BeforeClass
 * 2. Search ------------> @Test
 * 3. Advance Search ----> @Test
 * 4. Logout-------------> @AfterClass
 */

public class Practice02 {
	
	@BeforeClass
	void login() {
		System.out.println("This is login.");
	}
	
	@Test(priority=1)
	void testSearch() {
		System.out.println("This is search.");
	}
	
	@Test(priority=2)
	void testAdvanceSearch() {
		System.out.println("This is advance search.");
	}
	
	@AfterClass
	void testLogout() {
		System.out.println("This is logout.");
	}
}
