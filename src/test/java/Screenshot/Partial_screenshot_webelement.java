package Screenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

public class Partial_screenshot_webelement
{
    @Test
    public void takepartialScreenshot() throws IOException {
        WebDriver driver=new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/angularpractice/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        driver.switchTo().newWindow(WindowType.WINDOW);

        Set<String> windo=driver.getWindowHandles();

        ArrayList<String> ar=new ArrayList<String>(windo);
        String pid=ar.get(0);
        String cid=ar.get(1);

        driver.switchTo().window(cid);

        driver.get("https://rahulshettyacademy.com/");

        String text=driver.findElement(By.xpath("(//a[@href='https://courses.rahulshettyacademy.com/courses'])[1]")).getText();


        driver.switchTo().window(pid);

        WebElement input=driver.findElement(By.xpath("(//input[@name='name'])[1]"));
                input.sendKeys(text);

               File ss =input.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(ss,new File("/home/vedprakash/sspartial.png"));













    }
}
