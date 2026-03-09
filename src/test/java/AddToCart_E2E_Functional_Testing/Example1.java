package AddToCart_E2E_Functional_Testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
public class Example1
{
    @Test
    public void TestE2E()
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        int j=0;

        List<WebElement> name=driver.findElements(By.cssSelector("h4.product-name"));

        String[] itemsNeeded={"Beetroot","Brocolli","Potato","Pumpkin"};

        for (int i=0; i<name.size();i++)
        {
            //After fetching product format it /split later part of "-1kg" etc // and use trim to remove space
            // Potato - 1 Kg
            String[] fName = name.get(i).getText().split("-");
           String formattedName= fName[0].trim();

           //converting array to arraylist becz contains method not in array for simplification

            List itemsList =Arrays.asList(itemsNeeded);


            if (itemsList.contains(formattedName))
            {
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                if (j==itemsNeeded.length)
                {
                    break;
                }
            }
        }







    }
}
