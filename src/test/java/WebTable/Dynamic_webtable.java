package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Dynamic_webtable
{
    @Test

public void verifyheader()
{
    WebDriver driver=new ChromeDriver();

    driver.get("https://seleniumpractise.blogspot.com/");
    driver.manage().window().maximize();

   List<WebElement> allheaders= driver.findElements(By.xpath("//table[@id='customers']//th"));

    Assert.assertEquals(allheaders.size(),5,"column count not same");
    boolean status =false;
    for (WebElement headers :allheaders)
    {
        String list=headers.getText();
        System.out.println(list);

        if (list.contains("Country"))
        {
            status=true;
            break;

        }

    }
    Assert.assertTrue(status);


}
}