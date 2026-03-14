package Multiple_Winodows_tabs_invoke;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

public class example1
{
    @Test
    public void test()
    {

        WebDriver driver=new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/angularpractice/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        driver.switchTo().newWindow(WindowType.WINDOW);

        Set<String> windo=driver.getWindowHandles();

        ArrayList<String>ar=new ArrayList<String>(windo);
        String pid=ar.get(0);
        String cid=ar.get(1);

        driver.switchTo().window(cid);

        driver.get("https://rahulshettyacademy.com/");

    String text=driver.findElement(By.xpath("(//a[@href='https://courses.rahulshettyacademy.com/courses'])[1]")).getText();


    driver.switchTo().window(pid);

    driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys(text);

    }
}
