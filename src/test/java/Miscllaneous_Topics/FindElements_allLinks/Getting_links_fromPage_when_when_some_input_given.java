package Miscllaneous_Topics.FindElements_allLinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Getting_links_fromPage_when_when_some_input_given
{
    @Test
    public void handle_autosugestive_dropdown() throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        driver.findElement(By.id("autosuggest")).sendKeys("co");

        Thread.sleep(2000);

        List<WebElement> options=driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));

        Thread.sleep(3000);

        for (WebElement option:options)
        {
            System.out.println(option);
            System.out.println(options.size());
        }



    }}
