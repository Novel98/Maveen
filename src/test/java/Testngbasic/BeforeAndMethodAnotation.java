//Program1
//Write a program to Before method and aftermethod
package Testngbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class BeforeAndMethodAnotation {
public WebDriver driver;
@BeforeMethod
public void beforeMethodExample(){
    System.out.println("this is before method");

    }

    @AfterMethod
    public void AfterMethodExample(){
        System.out.println("this is after method");

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
