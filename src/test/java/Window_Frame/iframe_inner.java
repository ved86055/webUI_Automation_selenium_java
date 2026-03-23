package Window_Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class iframe_inner
{
    @Test
    public void handleframe()
    {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.switchTo().frame("iframeResult");

        driver.switchTo().frame(0);

        System.out.println("Text inside innner frame is : "+ driver.findElement(By.xpath("//h1")).getText());

        driver.switchTo().parentFrame();

        System.out.println("Text inside outer frame is : "+ driver.findElement(By.xpath("//p")).getText());

    }
}
