package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class extractPasswordRSA
{

    @Test

    public  static void main1() throws InterruptedException {
        String name="veds";


        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        String extractedPass=extractPass(driver);
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().window().maximize();
        driver.findElement(By.id("inputUsername")).sendKeys(name);
        driver.findElement(By.name("inputPassword")).sendKeys(extractedPass);
        driver.findElement(By.xpath("//input[@name='chkboxOne']")).click();
        driver.findElement(By.xpath("//input[@value='agreeTerms']")).click();
        driver.findElement(By.cssSelector("Button.submit.signInBtn")).click();

        Thread.sleep(3000);

        Assert.assertEquals(driver.findElement(By.xpath("//p[text()='You are successfully logged in.']")).getText(),"You are successfully logged in.");


        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello " +  name  + ",");


    }

    public static String extractPass(WebDriver driver ) throws InterruptedException {

        driver.get("https://rahulshettyacademy.com/locatorspractice/");


        driver.findElement(By.linkText("Forgot your password?")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[text()='Reset Login']")).click();

        //Please use temporary password 'rahulshettyacademy' to Login.

        String password=driver.findElement(By.cssSelector("p.infoMsg")).getText();

        String[] passArray=password.split("'");

        String[]passArray2=passArray[1].split("'");

        String passewordfinal=passArray2[0];

        return passewordfinal;








    }



}
