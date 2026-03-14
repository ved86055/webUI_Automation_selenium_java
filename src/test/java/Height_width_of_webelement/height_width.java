package Height_width_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class height_width
{
    @Test
    public void H_W()
    {
        WebDriver driver=new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/angularpractice/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        WebElement box=driver.findElement(By.xpath("(//input[@name='name'])[1]"));

        System.out.println(box.getRect().getDimension().getHeight());
        System.out.println(box.getRect().getDimension().getWidth());


    }

}
