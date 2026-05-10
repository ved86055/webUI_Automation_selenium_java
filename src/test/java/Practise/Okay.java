package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class Okay
{
    @Test
    public void testGoogle() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().window().maximize();
        Thread.sleep(5000);


        driver.findElement(By.xpath("//a[@href='https://rahulshettyacademy.com/documents-request']")).click();

       Set<String> parent=driver.getWindowHandles();
      Iterator<String> it=parent.iterator();
      String parentid =it.next();
      String childid=it.next();
      driver.switchTo().window(childid);

        driver.findElement(By.xpath("//a[@href='https://courses.rahulshettyacademy.com/courses']"));

        Thread.sleep(5000);

        driver.switchTo().window(parentid);

        Thread.sleep(5000);

        driver.findElement(By.name("username")).sendKeys("ved");





    }}
