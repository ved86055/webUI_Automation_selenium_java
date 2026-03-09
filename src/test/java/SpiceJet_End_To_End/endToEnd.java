package SpiceJet_End_To_End;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class endToEnd {
    @Test
    public void testSpicejetUI() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        //One Way
        driver.findElement(By.xpath("//div[@data-testid='one-way-radio-button']")).click();
        Thread.sleep(3000);

        //Student
        driver.findElement(By.xpath("//div[text()='Students']")).click();

        Thread.sleep(3000);

        //From section
        driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
        Thread.sleep(3000);

        //From city selection
        driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-14lw9ot r-z2wwpe r-1rjd0u6 r-1g94qm0 r-u8s1d r-8fdsdq'] //div[text()='Aurangabad Airport']")).click();

        Thread.sleep(3000);

        //To city selection
        driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-14lw9ot r-z2wwpe r-1rjd0u6 r-1g94qm0 r-u8s1d r-8fdsdq'] //div[text()='Kangra Airport']")).click();

        Thread.sleep(2000);

        //Departure datev current date from calender

        driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41']")).click();

        Thread.sleep(2000);

        //select passenger tab

        driver.findElement(By.xpath("//div[text()='Passengers']")).click();
        Thread.sleep(1000);

        //add increase count
        for (int i = 1; i < 5; i++) {
            driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
        }

        //currency
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[text()='Currency']")).click();
        driver.findElement(By.xpath("//div[text()='INR']")).click();


        //search

        driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();


    }
}
