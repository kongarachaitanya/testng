package testngpackage;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Class1 {
	
	@BeforeTest
	public void login(){
		System.out.println("login is successfull");
	}
	@AfterTest
	public void logout(){
		System.out.println("logout is successfull");
	}
	@Test(priority =1)
	public void search(){
		
		System.out.println("search is successfull");
	}
	@Test(priority =2)
	public void advancedsearch(){
		System.out.println("advancedsearch is successfull");
	}
	@Test(priority =3)
	public void buyproducts(){
		System.out.println("buyproducts is successfull");
	}
	@Test(priority =4)
	public void testcase(){
		System.out.println("testcase in "+getClass().getSimpleName()
				+"with thread id:"+ Thread.currentThread().getId());
	}

}
