package Synchronization.Implicit_Explicit_wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class implicitExplicitExample
{
    @Test
    public void Test() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        int k=0;

        List<WebElement> AllProducts=driver.findElements(By.cssSelector("h4.product-name"));

        String [] itemsNeeded={"Pomegranate","Raspberry","Walnuts"};

        for (int i=0;i<AllProducts.size();i++) {

            String[] Format = AllProducts.get(i).getText().split("-");
            String Fname = Format[0].trim();

            List Listproduct = Arrays.asList(itemsNeeded);

            if (Listproduct.contains(Fname))
            {
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

                if (k==itemsNeeded.length)
                {
                    break;
                }
            }
        }

        driver.findElement(By.cssSelector("a.cart-icon")).click();

        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();

        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");

        driver.findElement(By.xpath("//button[text()='Apply']")).click();

        WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(5));
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));

        Assert.assertEquals(driver.findElement(By.cssSelector("span.promoInfo")).getText(),"Code applied ..!");










    }
}
