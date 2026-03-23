package Slider_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class example
{
    @Test
    public void slider() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        Actions act=new Actions(driver);

        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/#google_vignette");
        driver.manage().window().maximize();

        //Left slider moving
         WebElement minimumSlider=driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle')][1]"));

         System.out.println(minimumSlider.getLocation());



        act.dragAndDropBy(minimumSlider,150,0).perform();


        Thread.sleep(5000);

       WebElement maxSlider=driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle')][2]"));
        act.clickAndHold(maxSlider).moveByOffset(-100,0).release().perform();





    }
}
