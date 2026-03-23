package POP_UPS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Authentication_popup
{
    @Test
    public void AuthenticationP()
    {

        WebDriver driver = new ChromeDriver();
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");


        //add username and password : before URL
        //UN &PWD = admin
        // https://admin:admin@the-internet.herokuapp.com/basic_auth

        //original URL: https://the-internet.herokuapp.com/basic_auth
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));






    }
}
