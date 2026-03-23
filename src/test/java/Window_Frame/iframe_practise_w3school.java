package Window_Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class iframe_practise_w3school
{
    @Test
    public void practise()
    {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/html/html_iframe.asp");


        driver.manage().window().maximize();

       // System.out.println(driver.findElements(By.tagName("iframe")).size());

        driver.switchTo().frame(1);

        WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement link=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("CSS")));

        link.click();

    }
}
