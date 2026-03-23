package POP_UPS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Permission_popups
{
    @Test
    public void permissionpop()
    {
        ChromeOptions option=new ChromeOptions();
        option.addArguments("--disable-notification");


        WebDriver driver = new ChromeDriver(option);
        driver.get("https://www.airindia.com");







    }
}
