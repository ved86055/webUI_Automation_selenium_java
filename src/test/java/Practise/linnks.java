package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class linnks
{
    @Test
    public void test()
    {
        int count=0;
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.deadlinkcity.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        List<WebElement> linksall=driver.findElements(By.tagName("a"));
        System.out.println("Total links on page are "+ linksall.size());

        for (WebElement alllinks:linksall)
        {
           String linkspage=alllinks.getAttribute("href");

           if (linkspage.isEmpty() || linkspage==null)
           {
               System.out.println("Not possible as href has no attribute ");
               continue;
           }
           try {

               URL linkURL = new URL(linkspage);
               HttpURLConnection conct = (HttpURLConnection) linkURL.openConnection();
               conct.connect();

               if (conct.getResponseCode() >= 400) {
                   System.out.println(linkspage + "link is broken");
                   count++;
               } else {
                   System.out.println(linkspage + "Link is not brojen");
               }
           }
           catch (Exception e)
           {

           }


        }
        System.out.println("Broken link count is "+ count);










    }
}
