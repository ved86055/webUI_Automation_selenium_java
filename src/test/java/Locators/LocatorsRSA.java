package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LocatorsRSA
{
    @Test
    void loginpassword() throws InterruptedException {


        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("awe");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("wr2334");
        driver.findElement(By.cssSelector("Button.signInBtn")).click();
        System.out.println( driver.findElement(By.cssSelector("p.error")).getText());

        driver.findElement(By.linkText("Forgot your password?")).click();

        Thread.sleep(3000);


        driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("weee");

        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("vedff");


        driver.findElement(By.xpath("//form/input[3]")).sendKeys("1234567899");


        driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();

       // System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());

        Thread.sleep(3000);

        driver.findElement(By.cssSelector("button.go-to-login-btn")).click();


        driver.findElement(By.id("inputUsername")).sendKeys("ved");

        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");


        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.id("chkboxTwo")).click();



        driver.findElement(By.cssSelector("Button.submit.signInBtn")).click();

driver.findElement(By.xpath("//p[text()='You are successfully logged in.']")).getText();

        Assert.assertEquals(driver.findElement(By.xpath("//p[text()='You are successfully logged in.']")).getText(),"You are successfully logged in.");






    }
}
