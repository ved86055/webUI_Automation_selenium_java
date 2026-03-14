package Practise;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class option
{
    @Test
    public void test() throws IOException {
        WebDriver driver=new ChromeDriver();

        driver.get("https://qa-delivery.countrydelight.in/admin/");

       File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(src,new File("/home/vedprakash/ss.png"));


    }
}
