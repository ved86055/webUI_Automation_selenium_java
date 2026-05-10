package ActionClass;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class NewSite
{

    @Test
    public void Newsite() throws IOException {

        int count=0;

        WebDriver driver=new ChromeDriver();
        driver.get("http://www.deadlinkcity.com/");

       List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println("total no of links on page are"+links.size());

       for (WebElement allLinks:links)
       {
          String hrefatr =allLinks.getAttribute("href");

          if (hrefatr ==null ||hrefatr.isEmpty())
          {
              System.out.println("cant proceed");
              continue;
          }

          try
          {
          URL linkurl=new URL(hrefatr);
           HttpURLConnection conurl=(HttpURLConnection)linkurl.openConnection();
           conurl.connect();
           if (conurl.getResponseCode()>=400)
           {
               System.out.println(hrefatr+"broken link");
               count++;
           }
           else
           {
               System.out.println(hrefatr+"not broken");

           }}
          catch (Exception w)
          {

          }
       }

        System.out.println("count of broken lionks"+count);











    }





}
