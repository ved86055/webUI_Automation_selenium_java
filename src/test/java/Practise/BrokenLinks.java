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

public class BrokenLinks
{
    @Test
    public void BrokenLinks()
    {
        int brokenCount=0;
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.deadlinkcity.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        List<WebElement> allLinks=driver.findElements(By.tagName("a"));
        System.out.println("Total links on the page are "+ allLinks.size());

        for (WebElement links:allLinks)
        {
            String attvalue=links.getAttribute("href");

            if (attvalue.isEmpty() || attvalue==null)
            {
                System.out.println("Links cant be handled as no href Attribute");
                continue;
            }

            try
            {

                URL linkURL = new URL(attvalue);
                HttpURLConnection conn = (HttpURLConnection)linkURL.openConnection();
                conn.connect();
                //  conn.getResponseCode();
                if (conn.getResponseCode() >= 400) {
                    System.out.println(attvalue + "Link is broken");
                    brokenCount++;

                } else {
                    System.out.println(attvalue + "Link is nit broken");
                }
            }
            catch (Exception e)
            {

            }
        }
        System.out.println("Total broken links are: " + brokenCount);
    }
}
