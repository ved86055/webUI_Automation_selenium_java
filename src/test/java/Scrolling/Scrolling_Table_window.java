package Scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import javax.swing.text.Document;
import java.time.Duration;

import static java.awt.SystemColor.window;

public class Scrolling_Table_window
{


    @Test
    public void Scrollingwindow() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));


        JavascriptExecutor js=(JavascriptExecutor)driver;

        //complete window/Browser page  scriolling

       js.executeScript("window.scrollBy(0,500)");

        Thread.sleep(10000);

        js.executeScript("window.scrollBy(0,0)");


        //onlyb table scrolling

       js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");



    }
}
