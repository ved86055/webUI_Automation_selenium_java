package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class testgoogle
{
    @Test
    public void testGoogle() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        By searchBoxLocator = By.name("q");

// Step 1: Get search box
        WebElement searchBox = wait.until(
                ExpectedConditions.visibilityOfElementLocated(searchBoxLocator)
        );

// Step 2: Type text
        searchBox.sendKeys("selenium");

// Step 3: Wait for suggestions
        List<WebElement> options = wait.until(
                ExpectedConditions.presenceOfAllElementsLocatedBy(
                        By.xpath("//li//div[@role='option']")
                )
        );

// Step 4: Click option
        String expected = "selenium rich foods";

        for (WebElement option : options) {
            if (option.getText().equalsIgnoreCase(expected)) {
                option.click();
                break;
            }
        }

// Step 5: 🔥 Re-locate search box before validation
        searchBox = driver.findElement(searchBoxLocator);

// Step 6: Validate
        wait.until(ExpectedConditions.attributeToBe(searchBox, "value", expected));

        System.out.println("Selected: " + searchBox.getAttribute("value"));

        driver.quit();




    }}



/*
 WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));

        searchBox.sendKeys("Selenium");

        Thread.sleep(2000);

        String text;

        do
        {
            searchBox.sendKeys(Keys.ARROW_DOWN);
             text=searchBox.getAttribute("value");
            if (text.equals("selenium vitamin"))
            {
                searchBox.sendKeys(Keys.ENTER);
                break;
            }

        }
        while(!text.isEmpty());
 */
