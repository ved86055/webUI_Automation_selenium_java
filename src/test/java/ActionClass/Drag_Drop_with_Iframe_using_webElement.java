package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class Drag_Drop_with_Iframe_using_webElement
{
    @Test
    public void D_D_withIframe()
{

    WebDriver driver=new ChromeDriver();
    driver.get("https://jqueryui.com/droppable/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

    //Frame using webelement
    WebElement frame=driver.findElement(By.className("demo-frame"));

    driver.switchTo().frame(frame);

    WebElement source=driver.findElement(By.id("draggable"));
    WebElement destination=driver.findElement(By.id("droppable"));

    Actions act=new Actions(driver);

    act.dragAndDrop(source,destination).build().perform();

    driver.switchTo().defaultContent();
}
}
