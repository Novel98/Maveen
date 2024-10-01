//Program 2
//Write a program Before class and after class
package Testngbasic;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class BeforeClassAndAfterClass {

    public WebDriver driver;
    @AfterClass
    public void beforeClassExample(){
        System.out.println("this is After Class");

    }

    @BeforeClass
    public void AfterClassExample(){
        System.out.println("this is Before method");

    }
    @Test
    public void Testng_1(){
        System.out.println("This is the testng_1 code");
    }
    @Test
    public void Testng_2(){
        System.out.println("This is the testng_2 code");
    }


}

