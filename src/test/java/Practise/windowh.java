package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class windowh
{
    @Test
    public void practisewindow()
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.findElement(By.xpath("//a[@href='https://rahulshettyacademy.com/documents-request']")).click();

       Set<String> ids=driver.getWindowHandles();
        ArrayList<String> ar=new ArrayList<String>(ids);
      String parentID=  ar.get(0);
      String childId=  ar.get(1);

      driver.switchTo().window(childId);
        System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());


     /*  Iterator<String>it=ids.iterator();
       String parentId=it.next();
       String childId=it.next();

       driver.switchTo().window(childId); */

      //Please email us at mentor@rahulshettyacademy.com with below template to receive response

      //  String emailId=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];




    }
}
