package Testngbasic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependOnMethod {
    @Test
    public void verifyLogin(){
        Assert.assertTrue(false);
        System.out.println("Verify login");
    }
    @Test(dependsOnMethods = {"verifyLogin"})
        public void verifyHomePage(){
            System.out.println("This is HomePage");
        }
    }


