package Dropdowns.Static_dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Static_D2_use_for_loop
{
    @Test
    public void increase_count_of_passengers() throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        Thread.sleep(3000);

        driver.findElement(By.id("divpaxinfo")).click();


        for (int i=1;i<5;i++)
        {

            driver.findElement(By.id("hrefIncAdt")).click();


        }
    }
}
