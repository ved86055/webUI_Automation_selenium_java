package Miscllaneous_Topics.Interview_Questions_HCL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public  class Get_All_Links_from_page_Also_links_in_special_area {
  // @Test(priority = 1)
    public void GettingAllLinks() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        // as all Links mndatorily have tagname as /a

        System.out.println(driver.findElements(By.tagName("a")).size());
    }

    // Get the no of links at footer sectuion only

   // @Test (priority = 2)
    public void GetNoOfLinksAtFooterSection()
    {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
       WebElement footerDriver=driver.findElement(By.xpath("//div[@class=' footer_top_agile_w3ls gffoot footer_style']"));
        System.out.println(footerDriver.findElements(By.tagName("a")).size());
    }

    //from footer only links of first column

   // @Test (priority=3)
    public void footersectionOnlyFirstColumnLinks()
    {


        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        WebElement footerDriver=driver.findElement(By.xpath("//div[@class=' footer_top_agile_w3ls gffoot footer_style']"));

        //ALready we have reached footer in footerdriver : from there need to go to first column
        WebElement columnDriver=footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(columnDriver.findElements(By.tagName("a")).size());

    }
    // click on all the links and open it >>> in seperate tab

  //  @Test
    public void OpenFooterLinksOfFirstcolumn()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        WebElement footerDriver=driver.findElement(By.xpath("//div[@class=' footer_top_agile_w3ls gffoot footer_style']"));

        //ALready we have reached footer in footerdriver : from there need to go to first column
        WebElement columnDriver=footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));

        for (int i=1;i<columnDriver.findElements(By.tagName("a")).size();i++)
        {
            String clickOnLink=Keys.chord(Keys.CONTROL,Keys.ENTER);

            /*columnDriver.findElements(By.tagName("a")).get(i).click();
            * here instead of click ,method we use keybpoardd action : And it has to execute through sendKeys
            * */
            columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
        }
    }


    @Test
    public void GetAllLinksGetTitle() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        WebElement footerDriver = driver.findElement(By.xpath("//div[@class=' footer_top_agile_w3ls gffoot footer_style']"));

        //ALready we have reached footer in footerdriver : from there need to go to first column
        WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));

        //oprn links in new taba ans get title of all 4

        for (int i = 1; i < columnDriver.findElements(By.tagName("a")).size(); i++) {
            String PageLinks = Keys.chord(Keys.CONTROL, Keys.ENTER);
            columnDriver.findElements(By.tagName("a")).get(i).sendKeys(PageLinks);
        }

        Set<String> page = driver.getWindowHandles();
        Iterator<String> it = page.iterator();

        while (it.hasNext()) {
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }


    }}




















