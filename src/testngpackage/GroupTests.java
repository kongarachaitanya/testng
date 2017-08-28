package testngpackage;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GroupTests {
	@BeforeGroups (groups={"sanity","regression"})
	public void login(){
		System.out.println("login is successfull");
	}
	@AfterGroups (groups={"sanity","regression"})
	public void logout(){
		System.out.println("logout is successfull");
	}
	@Test (groups={"sanity"})
	public void search(){
		System.out.println("search is successfull");
	}
	@Test(groups={"regression"})
	public void advancedsearch(){
		System.out.println("advancedsearch is successfull");
	}
	@Test(groups={"sanity","regression"})
	public void buyproducts(){
		System.out.println("buyproducts is successfull");
	}
	@Test(groups={"regression"})
	public void abcd(){
		System.out.println("buyproducts is successfull");
	}
	@Test(groups={"regression"})
	public void xyz(){
		System.out.println("xyz is successfull");
	}
	@Test(groups={"sanity"})
	public void eee(){
		System.out.println("eee is successfull");
	}
}
