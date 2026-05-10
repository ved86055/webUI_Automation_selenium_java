package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.nio.file.WatchEvent;
import java.security.SecureRandom;
import java.time.Duration;
import java.util.List;

public class demo01
{
    @Test
    public void testGoogle() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(3));

        WebElement search=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
        search.sendKeys("selenium");


        List<WebElement> list = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
                        By.xpath("//ul[@role='listbox']//li")));
        for (WebElement opts:list)
       {
           if (opts.getText().equalsIgnoreCase("selenium rich foods"))
           {
               Thread.sleep(3000);
               opts.click();
               break;
           }

       }



}}
