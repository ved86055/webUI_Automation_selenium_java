package Upload_Download_file;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class RobotClass
{
    @Test
    public void robotclass() throws InterruptedException, AWTException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.foundit.in/seeker/profile");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

       // normal d.find element .click failed so use Javascript

       WebElement btn=driver.findElement(By.xpath("//input[@type='file']"));

        JavascriptExecutor js= (JavascriptExecutor)driver;


        //“arguments[0] refers to the first WebElement passed into executeScript.
        // Since I passed only fileInput, it is accessed using index 0.”
        js.executeScript("arguments[0].click()",btn);   //click action on button

        Robot rb=new Robot();
        rb.delay(2000);

        //copy the path / put file to clipboard when we do copy like that
        StringSelection ss=new StringSelection("/home/vedprakash/Downloads/download.xlsx"); //pointing to file

        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);  //copying

        //Now we need top paste path in upload window using ctrl+v

        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);

        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);

        //enter button hit

        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);








    }
}
/*
  //normal d.find element .click failed so use Javascript

        WebElement uploadbtn=driver.findElement(By.xpath("//input[@type='file']"));

        JavascriptExecutor js= (JavascriptExecutor)driver;


        //“arguments[0] refers to the first WebElement passed into executeScript.
        // Since I passed only fileInput, it is accessed using index 0.”
        js.executeScript("arguments[0].click()",uploadbtn);

        Thread.sleep(10000);
 */