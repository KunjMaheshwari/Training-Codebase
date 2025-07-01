package GroupingParctice;

import org.testng.annotations.Test;

//Comes under both sanity and regression.

public class PaymentTest {

	@Test(priority = 0, groups = {"sanity", "regression", "functional"})
	void paymentInRuppes(){
		System.out.println("Payment in Rupees");
	}
	
	@Test(priority=1, groups = {"sanity", "regression", "functional"})
	void paymentInDollars() {
		System.out.println("Payment in Dollars");
	}
}
