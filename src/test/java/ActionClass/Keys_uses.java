package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Keys_uses
{
    @Test
    public void keyboardactions()
    {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));



       WebElement element= driver.findElement(By.id("autocomplete"));
       element.sendKeys("ved shinde");
       element.sendKeys(Keys.chord(Keys.CONTROL,"a"));
       element.sendKeys(Keys.chord(Keys.CONTROL,"c"));



    }
}
