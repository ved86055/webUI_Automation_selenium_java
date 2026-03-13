package Broken_Links_Handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class Example1
{
    @Test
    public void handleBrokenLinks()
    {
        int countofBrokenLinks=0;

        WebDriver driver=new ChromeDriver();
        driver.get("http://www.deadlinkcity.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        List<WebElement> Links   =driver.findElements(By.tagName("a"));
        System.out.println("Total Links are " +  Links.size());


        for (WebElement linksStored:Links)
        {
           String hrefattValue=linksStored.getAttribute("href");

           if(hrefattValue==null || hrefattValue.isEmpty())
           {

               System.out.println("As href value is not there cant find out broken Linkls");
               continue;
           }

           try {
               URL linkurl = new URL(hrefattValue);
               HttpURLConnection connectURL = (HttpURLConnection) linkurl.openConnection();
               connectURL.connect();
               //   connectURL.getResponseCode();

               if (connectURL.getResponseCode() >= 400)
               {
                   System.out.println(hrefattValue + ">>>>>Link Is Broken");
                   countofBrokenLinks++;
               }
               else {
                   System.out.println(hrefattValue + ">>>>>>>Link is not Broken ");
               }
           }
           catch (Exception e)
           {

           }
        }
        System.out.println("Total broken links are: " + countofBrokenLinks);

    }
}
