package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class tests
{
    @Test
    public void testing()
    {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        WebElement footerDriver=driver.findElement(By.xpath("//div[@class=' footer_top_agile_w3ls gffoot footer_style']"));

       WebElement columnDriver=driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(columnDriver.findElements(By.tagName("a")).size());

        for (int i=1;i<columnDriver.findElements(By.tagName("a")).size();i++)
        {

           String links= Keys.chord(Keys.CONTROL,Keys.ENTER);
            columnDriver.findElements(By.tagName("a")).get(i).sendKeys(links);


        }







    }
}
