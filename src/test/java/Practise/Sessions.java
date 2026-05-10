package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.net.Socket;
import java.time.Duration;
import java.util.List;

public class Sessions
{
    @Test
    public void sesion()
    {
        WebDriver driver=new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
String text=driver.findElement(By.xpath("//input[@value='radio1']/ancestor::fieldset/legend")).getText();
        System.out.println(text);
    }
}
