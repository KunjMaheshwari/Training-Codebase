package Practice01;

import org.testng.annotations.Test;

//1. Open app
//2. Login 
//3. Logout

public class Practice01Test {
	
	@Test(priority=1)
	void openApp() { 
		System.out.println("Opening the application.");
	}
	
	@Test(priority =2)
	void login() {
		System.out.println("Login the Application");
	}
	
	@Test(priority=3)
	void logout() {
		System.out.println("Logout the Application.");
	}
}
