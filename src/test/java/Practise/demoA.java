package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class demoA {
    @Test
    public void testMakeMyTripLogin() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.airindia.com/");
        driver.manage().window().maximize();




        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement cookie=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("onetrust-accept-btn-handler")));
        cookie.click();

        driver.findElement(By.xpath("//label[normalize-space(.)='One Way']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@aria-label='Select origin airport']"))).click();


        driver.findElement(By.xpath("(//input[@aria-label='Select origin airport'])[1]")).sendKeys("SURAT");



        /*
        WebElement acceptCookies = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[contains(text(),'Accept All')]")
        ));

        acceptCookies.click(); */




    }
}