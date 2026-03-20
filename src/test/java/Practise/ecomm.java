package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class ecomm {
    @Test
    public void ecom() {


        String item="ZARA COAT 3";

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/client");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        driver.manage().window().maximize();

        driver.findElement(By.id("userEmail")).sendKeys("vvs@gmail.com");
        driver.findElement(By.id("userPassword")).sendKeys("Vboss@123");
        driver.findElement(By.id("login")).click();


        //finding product and adding to cart

        List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));

        WebElement prod = null;

        for (WebElement product : products) {
            String productname = product.findElement(By.cssSelector("b")).getText();

            if (productname.equals(item)) {

                prod = product;
                break;
            }
        }
        prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".ngx-spinner-overlay")));

        driver.findElement(By.cssSelector(".btn.btn-custom[routerlink='/dashboard/cart']")).click();

        //cart comaparison: itsm in cart matchees or not with desired

       List<WebElement> cartproducts=driver.findElements(By.cssSelector(".cartSection h3"));
       Boolean match=false;

       for (WebElement cartprod:cartproducts)
       {

         String itemincart= cartprod.getText();
         if (itemincart.equalsIgnoreCase(item))
         {
             match=true;
             break;

         }
       }
        Assert.assertTrue(match);

       driver.findElement(By.xpath("//div[@class='subtotal cf ng-star-inserted']//button")).click();

       //clicking on country autosuggestion
        driver.findElement(By.xpath("//div[@class='user__address']//input")).sendKeys("ind");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));
       List<WebElement> allcountry=driver.findElements(By.cssSelector(".ta-item"));
       for (WebElement country:allcountry)
       {

           if (country.getText().equalsIgnoreCase("india"))
           {
               driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
               country.click();
               break;
           }
       }

       //place order

        driver.findElement(By.cssSelector(".btnn.action__submit")).click();

       //grab final text

       String mesg=driver.findElement(By.cssSelector(".hero-primary")).getText();

       Assert.assertTrue(mesg.equalsIgnoreCase("THANKYOU FOR THE ORDER."));

       driver.close();
    }
}
