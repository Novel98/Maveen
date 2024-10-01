package Testngbasic;

import org.testng.annotations.*;

public class BeforeAfterMethod {

    @BeforeClass
    public void beforemethodDemo(){
        System.out.println("BeforMethod");
    }
@AfterClass
public void afterMethodDemo(){
    System.out.println("After method Demo");
}
    @Test
    public void verifyMethod_1(){
        System.out.println("verify method 1");
    }
    @Test
    public void verifyMethod_2(){
        System.out.println("verify method2");

    }
}
