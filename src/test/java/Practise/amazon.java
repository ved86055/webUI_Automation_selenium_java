package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class amazon {
    @Test
    void extractPass() throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[text()='Reset Login']")).click();

        //Please use temporary password 'rahulshettyacademy' to Login.

        driver.findElement(By.cssSelector("p.infoMsg")).getText();


    }
}