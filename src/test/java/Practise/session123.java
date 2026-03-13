package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class session123
{
    @Test
    public void testo() throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        driver.get("https://demo.automationtesting.in/Frames.html");

        Thread.sleep(3000);

       int num=driver.findElements(By.tagName("iframe")).size();
        System.out.println(num);

        /*
        WebElement fadd=driver.findElement(By.xpath("//iframe"));
        driver.switchTo().frame(fadd);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ved"); */
    }
}
