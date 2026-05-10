package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class P1
{
    @Test
    public void pickedup() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();



        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));


        driver.findElement(By.id("opentab")).click();

        Set<String> windows=driver.getWindowHandles();
       Iterator<String> it= windows.iterator();
       String pid=it.next();
       String cid=it.next();


        for (String list:windows)
        {
           if (!list.equals(pid))
           {
               driver.switchTo().window(list);
               Thread.sleep(5000);
               driver.switchTo().window(pid);


               driver.findElement(By.xpath("//input[contains(@id,'name')]")).sendKeys("ved");


               driver.findElement(By.xpath("//input[contains(@value,'Confirm')]")).click();

               System.out.println(driver.switchTo().alert().getText());

               driver.switchTo().alert().dismiss();

           }

        }









    }
}
