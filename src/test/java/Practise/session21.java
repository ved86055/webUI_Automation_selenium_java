package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class session21
{
    @Test
    public void test()
    {
         WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        System.out.println( driver.findElements(By.tagName("iframe")).size());

        driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium']")).click();




    }
}
