package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
    @Test
    public void verifyHardAssertionCase(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//[text()='Create a Rediffmail account']")).click();
        String text=driver.findElement(By.xpath("//td[text()='Create a Rediffmail account']")).getText();

       // Assert.a
    }
}
