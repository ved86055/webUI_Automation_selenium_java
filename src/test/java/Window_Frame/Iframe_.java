package Window_Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Iframe_
{
    @Test
    public void testiframe()
    {

        WebDriver driver=new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        System.out.println( driver.findElements(By.tagName("iframe")).size());

        WebElement iframe=driver.findElement(By.id("courses-iframe"));
        driver.switchTo().frame(iframe);

        driver.findElement(By.xpath("//a[contains(text(),'VIEW ALL COURSES')]")).click();

    }

}
