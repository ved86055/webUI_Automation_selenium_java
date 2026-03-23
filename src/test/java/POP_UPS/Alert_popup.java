package POP_UPS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Alert_popup
{
    @Test
    void handleAlertpopUp()
    {
        String name="vedprakash";
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));



        driver.findElement(By.id("name")).sendKeys(name);

        driver.findElement(By.id("alertbtn")).click();

        driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();

        driver.findElement(By.id("confirmbtn")).click();

        driver.switchTo().alert().getText();

        driver.switchTo().alert().dismiss();
    }
}
