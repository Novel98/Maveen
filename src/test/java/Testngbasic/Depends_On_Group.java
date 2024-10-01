//Program 6
//Write a program depends on group and enable
package Testngbasic;

import org.testng.annotations.Test;

public class Depends_On_Group {
    @Test(groups = {"smoke"})
    public void VerifyHomePage(){
        System.out.println("Verify Home Page");
    }
    @Test(dependsOnGroups = {"smoke"},alwaysRun = true)
    public void VerifySignPage(){
        System.out.println("Verify sign Page");
    }
    @Test(enabled = false)
    public void VerifyLoginPage(){
        System.out.println("Verify Login Page");
    }

}
