package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Session5
{
    @Test
    void extract() throws InterruptedException {


    String name="veds";


    WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        String extractedpwd=Testpass(driver);
        System.out.println(extractedpwd);
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().window().maximize();
        driver.findElement(By.id("inputUsername")).sendKeys(name);
        driver.findElement(By.name("inputPassword")).sendKeys(extractedpwd);
        driver.findElement(By.xpath("//input[@name='chkboxOne']")).click();
        driver.findElement(By.xpath("//input[@value='agreeTerms']")).click();
        driver.findElement(By.cssSelector("Button.submit.signInBtn")).click();

        Thread.sleep(3000);

        Assert.assertEquals(driver.findElement(By.xpath("//p[text()='You are successfully logged in.']")).getText(),"You are successfully logged in.");


        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello " +  name  + ",");

}
public String Testpass(WebDriver driver ) throws InterruptedException {
    driver.get("https://rahulshettyacademy.com/locatorspractice/");
    driver.manage().window().maximize();
    driver.findElement(By.linkText("Forgot your password?")).click();

    Thread.sleep(3000);

    driver.findElement(By.xpath("//button[text()='Reset Login']")).click();

    String pwd=driver.findElement(By.cssSelector("p.infoMsg")).getText();

    String []PwdArray=pwd.split("'");
    String pwdArray2=PwdArray[1];
 String []pswrd=   pwdArray2.split("'");
 String finalPass=pswrd[0];
 return finalPass;






}
}
