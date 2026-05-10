package Practise;

import org.bouncycastle.jcajce.provider.symmetric.ChaCha;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.*;

public class tess {
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();

        driver.get("https://en.wikipedia.org/wiki/List_of_cities_by_average_temperature");
        driver.manage().window().maximize();

       List<WebElement> allheaders=driver.findElements(By.xpath("//table[contains(@class,'wikitable')]//th"));
        System.out.println( allheaders.size());

        boolean status =false;

        for (WebElement hlinks:allheaders)
        {
            String text=hlinks.getText();
            System.out.println(text);
            if (text.contains("Mar"))
            {
                status=true;
                break;


            }

        }
        Assert.assertTrue(status,"couldnt found");



    }
}


