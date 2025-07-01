package GroupingParctice;

import org.testng.annotations.Test;

//Comes under Sanity.
public class LoginTests{
	
	@Test(priority=0, groups = {"sanity"})
	void loginByEmail() {
		System.out.println("Login by Email.");
	}
	
	@Test(priority=1, groups = {"sanity"})
	void loginBySms() {
		System.out.println("Login by Sms.");
	}
	
	@Test(priority=2, groups = {"sanity"})
	void loginByFaceBook() {
		System.out.println("Login by FaceBook.");
	}
}
