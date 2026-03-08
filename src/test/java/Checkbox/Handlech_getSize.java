package Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Handlech_getSize
{
    @Test
    void checkboxHandling() throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        Assert.assertFalse( driver.findElement(By.xpath("//div[text()='Students']")).isSelected());

        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[text()='Students']")).click();
        Thread.sleep(2000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[@data-testid='home-page-travellers']"))).click();

        Thread.sleep(2000);
        for (int i=1;i<5;i++)
        {
            wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']"))).click();


        }








    }
}
