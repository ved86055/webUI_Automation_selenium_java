package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Testing
{
    @Test
    public void testpractise()
    {



        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

// Handle popup safely
        try {
            driver.findElement(By.xpath("//input[@data-action-type='DISMISS']")).click();
        } catch (Exception e) {
            // ignore if not present
        }


        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("football");

        int count=0;
       List <WebElement> option=driver.findElements(By.xpath("//div[@role='button']"));

        for (WebElement opt:option)
        {

            String text = opt.getAttribute("aria-label");

            if (text.toLowerCase().contains("football")) {
                count++;

                if (count == 4) {
                    opt.click();
                    break;


        }




}}}}
