package Dropdowns.Static_dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Static_D1
{

    @Test

    public void DropdownTesting()
    {

        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

        driver.manage().window().maximize();

        WebElement staticdropdown =driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

        Select dropdown =new Select(staticdropdown);


        //Select By index

        dropdown.selectByIndex(2);
        System.out.println(dropdown.getFirstSelectedOption().getText());

        //select by visible text

        dropdown.selectByVisibleText("INR");
        Assert.assertEquals(dropdown.getFirstSelectedOption().getText(),"INR");


        //by value

        dropdown.selectByValue("USD");
        Assert.assertEquals(dropdown.getFirstSelectedOption().getText(),"USD");

    }






}
