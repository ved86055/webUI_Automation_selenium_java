import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Session1
{
    //@Test
    void chromeopening() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://qa-delivery.countrydelight.in/admin/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.close();
    }
   // @Test
    void firefox()
    {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://qa-delivery.countrydelight.in/admin/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.close();
    }

    @Test
    void edge()
    {
        WebDriver driver=new EdgeDriver();
        driver.get("https://qa-delivery.countrydelight.in/admin/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

    }

}
