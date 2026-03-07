package Dropdowns.Dynamic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Handle_DynDropD_using_INDEX
{
    @Test
    public void UsingIndex() throws InterruptedException {

        WebDriver driver =new ChromeDriver();

        driver.get("https://www.spicejet.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.manage().window().maximize();

        driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-tju18j r-5njf8e r-1otgn73'])")).click();

        driver.findElement(By.xpath("//div[text()='Chandigarh']")).click();

        Thread.sleep(2000);

      driver .findElement(By.xpath("//div[text()='Indore']")).click();









    }
}
