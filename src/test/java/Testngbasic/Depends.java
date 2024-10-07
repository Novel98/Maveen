package Testngbasic;

import org.testng.Assert;
import org.testng.annotations.Test;
// always =true
public class Depends {

    @Test(groups = {"smoke"})
    public void verifyAddToCard(){

        System.out.println("verify add to card");

    }

    @Test(dependsOnGroups = {"smoke"})
    public void verifyadd(){
        System.out.println("verify to add order");
    }

    @Test(enabled = false)
    public void verifypayment(){
        System.out.println("pay the order");
        driver.close();
    }
}
