package Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class CheckboxRahulShettyServer
{
    @Test
    void checkboxHandling() throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
        driver.findElement(By.id("divpaxinfo")).click();

        //cpint no of checkboxws
        System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());


        for (int i=1;i<5;i++)
        {

            driver.findElement(By.id("hrefIncAdt")).click();


        }
}}
