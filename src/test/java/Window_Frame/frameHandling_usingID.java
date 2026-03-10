package Window_Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class frameHandling_usingID
{
    @Test
    public void Hold_Release_Alternative_ofDD_useOf_ID_in_iframe()
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        //findout how many frames present : iframe is constant tagname for all iframe
        System.out.println(driver.findElements(By.tagName("iframe")).size());

        driver.switchTo().frame(0);

        WebElement source=driver.findElement(By.id("draggable"));
        WebElement destination=driver.findElement(By.id("droppable"));

        Actions act=new Actions(driver);

        act.clickAndHold(source).moveToElement(destination).release().build().perform();

        driver.switchTo().defaultContent();

    }
}
