package testngpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Class2 {
	/*@BeforeClass
	public void login(){
		System.out.println("login is successfull");
	}
	@AfterClass
	public void logout(){
		System.out.println("logout is successfull");
	}*/
	@Test(priority =1)
	public void accountSummary(){
		System.out.println("AccountSummary is successfull");
	}
	@Test(priority =2)
	public void fundTransfer(){
		System.out.println("fund Transfer is successfull");
	}
	@Test(priority =3)
	public void billpayment(){
		System.out.println("billpayment is successfull");
	}
	@Test(priority =4)
	public void testcase(){
		System.out.println("testcase in "+getClass().getSimpleName()
				+"with thread id:"+ Thread.currentThread().getId());
	}
}
