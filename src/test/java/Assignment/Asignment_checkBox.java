package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Asignment_checkBox
{

    @Test
    public void checkbox() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        driver.findElement(By.id("checkBoxOption1")).click();

        Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());

        Thread.sleep(3000);

        driver.findElement(By.id("checkBoxOption1")).click();

        Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());


        System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());







    }
}
