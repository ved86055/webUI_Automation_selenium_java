package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class p4
{

    @Test
    public void last() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[contains(@id,'name')]")).sendKeys("ved");


        driver.findElement(By.xpath("//input[contains(@value,'Confirm')]")).click();

        System.out.println(driver.switchTo().alert().getText());

        driver.switchTo().alert().dismiss();




      }




    }


