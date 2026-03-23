package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.net.Socket;
import java.util.List;

public class Static_wikipediaTable
{
    @Test
    public void getCityTempfromTable()
    {

        String targetcity="Gangtok";
        WebDriver driver=new ChromeDriver();

        driver.get("https://en.wikipedia.org/wiki/List_of_cities_by_average_temperature");
        driver.manage().window().maximize();

       List<WebElement> rows=driver.findElements(By.xpath("//table[contains(@class,'wikitable')]//tr"));

       for (int i=1;i<rows.size();i++)
          {
              List <WebElement> col=rows.get(i).findElements(By.tagName("td"));

              if (col.size()>0)
              {
                  String cityName=col.get(1).getText();

                  if (cityName.toLowerCase().contains(targetcity.toLowerCase()))
                  {
                     String temp=col.get(col.size()-11).getText();
                      System.out.println("temp of "+ targetcity + ":" +temp);
                  }

              }
          }
    }
}
