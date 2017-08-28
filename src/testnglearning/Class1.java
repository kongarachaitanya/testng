package testnglearning;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {
    @BeforeTest
    public void login(){
    System.out.println("Login Successful");
    }
    @AfterTest
    public void logout(){
    System.out.println("Logout Successful");
    }
    @Test (priority = 1)
    public void search(){
    System.out.println("Search Successful");
    }
    @Test (priority = 2)
    public void advancedSearch(){
    System.out.println("Advanced Search Successful");
    }
    @Test (priority = 3)
    public void buyProducts(){
    System.out.println("Buying Products Successful");
    }
    @Test (priority = 4)
    public void testCase(){
    System.out.println("Test Case in "+getClass().getSimpleName()
    + " With Thread id: " + Thread.currentThread().getId());
    }
    }