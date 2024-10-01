package Testngbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NeedOfTest {
    @Test
    public void openAmazonUrl()  {

        WebDriver driver = new ChromeDriver();
        driver.get("https://Amazon.com");
        driver.manage().window().maximize();

        driver.close();


    }

    @Test
    public void openSeleniumUrl(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://flipkart.com");
        driver.manage().window().maximize();
        driver.close();


    }

}
