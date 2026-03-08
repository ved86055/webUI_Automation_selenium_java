package Calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Current_data_only
{
    @Test
    public void currentDateCalender()
    {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        driver.findElement(By.xpath("//div[@data-testid='departure-date-dropdown-label-test-id']")).click();

        driver.findElement(By.xpath("//div[@data-testid='one-way-radio-button']")).click();




    }
}
