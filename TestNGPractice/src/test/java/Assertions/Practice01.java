package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice01 {
	
	@Test
	void testTitle() {
		String exp_title = "Opencart";
		
		String act_title = "Opencart";
		
		/*if(exp_title.equals(act_title)) {
			System.out.println("Test is passed");
		}else {
			System.out.println("Test is failed");
		}*/
		
		if(exp_title.equals(act_title)) {
			System.out.println("Test case is passed.");
			Assert.assertTrue(true);
		}else {
			System.out.println("Test case is failed");
			Assert.assertTrue(false);
		}
		
		//Assert.assertEquals(exp_title, act_title);
	}
}
