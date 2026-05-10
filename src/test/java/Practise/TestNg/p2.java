package Practise.TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class p2
{
    @Test

   public void session() throws InterruptedException {

       WebDriver driver=new ChromeDriver();

       driver.get("https://rahulshettyacademy.com/AutomationPractice/");
       driver.manage().window().maximize();
       String title =driver.getTitle();
       System.out.println(title);
       String url =driver.getCurrentUrl();
       System.out.println(url);
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));




      WebElement opt =driver.findElement(By.xpath("//select[@name='dropdown-class-example']"));

      Select dropd=new Select(opt);

      dropd.selectByVisibleText("Option3");
      Assert.assertEquals(dropd.getFirstSelectedOption().getText(),"Option3");




   }
}
