package Practise;

import org.bouncycastle.est.ESTAuth;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class table
{
    WebDriver driver;
    //@Test
    public void verifyheader() {
         driver = new ChromeDriver();

        driver.get("https://en.wikipedia.org/wiki/List_of_cities_by_average_temperature");
        driver.manage().window().maximize();

       List<WebElement> headersall = driver.findElements(By.xpath("//table[contains(@class,'wikitable')]//th"));

        System.out.println(headersall.size());
        boolean result=false;

        for (WebElement headers:headersall)
        {
           String hname= headers.getText();
            System.out.println(hname);

            if (hname.contains("Aug"))
            {
                result=true;
                break;
            }

        }
        Assert.assertTrue(result,"not found");}


            @Test
            public void testcolumn()
            {
                driver=new ChromeDriver();
                driver.get("https://en.wikipedia.org/wiki/List_of_cities_by_average_temperature");

                driver.manage().window().maximize();

               List<WebElement> column= driver.findElements(By.xpath("//table[contains(@class,'wikitable')]//td[2]"));


                System.out.println( column.size());

                boolean result=false;

                for (WebElement col:column)
                {

                   if (col.getText().contains("Luanda"))
                   {
                       System.out.println(col.getText());
                       col.click();
                       result =true;
                       break;
                   }

                }










            }




    }













