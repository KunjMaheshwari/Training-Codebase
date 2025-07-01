package GroupingParctice;

import org.testng.annotations.Test;

//Comes under Regression.

public class SignUpTest {

	@Test(priority=0, groups = {"regression"})
	void signUpEmail() {
		System.out.println("Sign up by Email.");
	}
	
	@Test(priority = 1, groups = {"regression"})
	void signUpSms() {
		System.out.println("Sign up by sms.");
	}
	
	@Test(priority=2, groups = {"regression"})
	void signUpFaceBook() {
		System.out.println("Sign up by FaceBook.");
	}
}
