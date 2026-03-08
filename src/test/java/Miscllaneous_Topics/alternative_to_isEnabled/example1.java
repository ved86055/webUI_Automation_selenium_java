package Miscllaneous_Topics.alternative_to_isEnabled;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class example1
{
    //Validation if UI elements are disbled/emabled with attributes
    //here 0.5 is for one way & 1 is for 2 way so 2 way is enebled or not we have o check so contains is 1

    @Test
    public void test()
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        //currently not getting any attribute here which is changing simply working fine so just practise code

        driver.findElement(By.xpath("//div[text()='round trip']")).click();
      //  System.out.println(driver.findElement(By.xpath("//div[@data-testid='return-date-dropdown-label-test-id']")).isEnabled());


        driver.findElement(By.id("div1")).getAttribute("style");
        if (driver.findElement(By.id("div1")).getAttribute("style").contains("1"))
        {
            System.out.println("its enabled ");
        }
        else {
            System.out.println("disabled ");
        }




    }
}
