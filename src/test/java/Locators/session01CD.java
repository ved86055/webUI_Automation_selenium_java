package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class session01CD
{
    @Test
    void loginpass() throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        driver.get("https://qa-delivery.countrydelight.in/admin/login/?next=/admin/");
        driver.manage().window().maximize();

        driver.findElement(By.id("id_username")).sendKeys("veds");
        driver.findElement(By.name("password")).sendKeys("Vboss@123");
        driver.findElement(By.cssSelector("input[value='Log in']")).click();







    }
}
