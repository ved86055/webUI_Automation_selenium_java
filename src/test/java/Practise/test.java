package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class test
{

        @Test
        public void handle_autosugestive_dropdown() throws InterruptedException {
            WebDriver driver = new ChromeDriver();

            driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

            driver.findElement(By.id("autosuggest")).sendKeys("co");


           List<WebElement> options=driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));

           for (WebElement option:options)
           {
               if (option.getText().equalsIgnoreCase("colombia"))
               {
                   Thread.sleep(2222);
                   option.click();
                   break;
               }

           }



        }}
