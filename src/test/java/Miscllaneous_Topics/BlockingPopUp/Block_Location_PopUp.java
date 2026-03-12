package Miscllaneous_Topics.BlockingPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Arrays;

public class Block_Location_PopUp
{
    @Test
    public void blockLoactionPopUp() throws InterruptedException {


        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        driver.get("https://www.airindia.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();

    }
}
