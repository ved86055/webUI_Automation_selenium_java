package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Wikipedia
{
    @Test
    public void wiki()
    {
        String targetCity="Mumbai";

        WebDriver driver=new ChromeDriver();

        driver.get("https://en.wikipedia.org/wiki/List_of_cities_by_average_temperature");
        driver.manage().window().maximize();

      List<WebElement> rows=driver.findElements(By.xpath("//table[contains(@class,'wikitable')]//tr"));



       for (int i=1;i<rows.size();i++)
       {

          List <WebElement>col=rows.get(i).findElements(By.tagName("td"));

          if (col.size()>0)
          {
              String cityname=col.get(1).getText();


              if (cityname.toLowerCase().contains(targetCity.toLowerCase()))
              {
                  String temperature=col.get(col.size()-3).getText();
                  System.out.println(targetCity + " temperature is " + temperature );
                  break;
              }
          }
          }
      }




    }

