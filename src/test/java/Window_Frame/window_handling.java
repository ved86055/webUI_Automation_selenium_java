package Window_Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class window_handling
{
    @Test
    public void handleWindow()
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.findElement(By.xpath("//a[@href='https://rahulshettyacademy.com/documents-request']")).click();

        //Window handling can be done using Arraylist also
        /*
          Set<String> windowid=  driver.getWindowHandles();
          ArrayList<String> ar=new ArrayList<String>(ids);
          String PId=  ar.get(0);
          String chId=  ar.get(1);
        driver.switchTo().window(chId);
        */

        //Window handling
        Set<String> windowid=  driver.getWindowHandles();
      Iterator<String> it =windowid.iterator();
     String parentid=it.next();
     String childid=it.next();

     driver.switchTo().window(childid);

     //child window : this and below this is duplicate line for understanding in 1 line only after get text can perform

        System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());


        //extract username ony from : "Please email us at mentor@rahulshettyacademy.com with below template to receive response
        String emailID=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];

                //move again to parent window

                driver.switchTo().window(parentid);
        //enter username now
        driver.findElement(By.id("username")).sendKeys("emailID");



    }
}
