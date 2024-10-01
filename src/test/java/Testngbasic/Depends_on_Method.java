//Program 5
//Write a program for verify DependsOnMethod

package Testngbasic;

import org.testng.annotations.Test;

public class Depends_on_Method {
    @Test
    public void VerifyHomePage(){
        System.out.println("Verify Home Page");
    }
    @Test(dependsOnMethods = {"verifyHomePage"})
    public void VerifySignPage(){
        System.out.println("Verify sign Page");
    }
    @Test
    public void VerifyLoginPage(){
        System.out.println("Verify Login Page");
    }


}
