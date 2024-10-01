package Testngbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class practise {

    @Test
    public void openurl() {
WebDriver driver=new ChromeDriver();
driver.get("http://amazon.in/");
driver.close();

    }

    @Test
    public void openurl2() {
        WebDriver driver1=new ChromeDriver();
        driver1.get("http://flipkart.in/");
    }
}
