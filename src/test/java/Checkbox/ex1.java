package Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class ex1
{
    @Test
    public void checkbox_various_example()
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

      List<WebElement> days= driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));

        System.out.println(days.size());

        //Click on all 7 checkboxes

     /* for (int i=0;i<days.size();i++)
      {

          days.get(i).click();
      }

      for (WebElement day:days)
      {
          day.click();
      }

      // To select only Monday & sunday
        for (WebElement day:days)
        {
           String value=day.getAttribute("id");

           if (value.equals("monday")||value.equals("sunday"))
           {
               day.click();
           }

      //select last 3


        for (int i=checkbox-2;i<checkbox;i++)
        {
           days.get(i).click();
        } */

        //seletc first 2

        int checkbox=days.size();

        for (int i=0;i<checkbox;i++)
        {
            if (i<2)
            days.get(i).click();
        }











    }
}
