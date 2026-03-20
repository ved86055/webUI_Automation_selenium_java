package Upload_Download_file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class SendKeys_Combine_example
{
    @Test
    public void upDown()
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/upload-download-test/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.findElement(By.id("downloadButton")).click();

      WebElement uploadfile= driver.findElement(By.xpath("//input[@type='file']"));
      uploadfile.sendKeys("/home/vedprakash/Downloads/download.xlsx");


        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(7));

       By toast=By.cssSelector(".Toastify__toast-body div:nth-child(2)");
        wait.until(ExpectedConditions.visibilityOfElementLocated(toast));

       String toasttext=driver.findElement(toast).getText();
        Assert.assertEquals("Updated Excel Data Successfully.",toasttext);

        wait.until(ExpectedConditions.invisibilityOfElementLocated(toast));






    }
}
