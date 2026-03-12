package Miscllaneous_Topics.Handle_HTTPS_Certification;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.time.Duration;

public class example_ssl
{
    @Test
    public void Handlingssl()
    {
        ChromeOptions options=new ChromeOptions();
        options.setAcceptInsecureCerts(true);

        WebDriver driver=new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        driver.get("https://expired.badssl.com/");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());





    }
}
