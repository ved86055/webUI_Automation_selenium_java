package ShadowDom;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class shadowDom
{
    @Test
    public void testshadowdom() throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://books-pwakit.appspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        driver.manage().window().maximize();

        SearchContext shadow=driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
        Thread.sleep(2000);
        shadow.findElement(By.cssSelector("#input")).sendKeys("welcome ved");






    }
}
