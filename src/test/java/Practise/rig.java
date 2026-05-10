package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.List;
import java.net.URL;

public class rig
{

    public void mix() throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.deadlinkcity.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        List<WebElement> Links = driver.findElements(By.tagName("a"));
        System.out.println("Total Links are " + Links.size());


        for (WebElement linksStored : Links) {
            String hrefattValue = linksStored.getAttribute("href");

            if (hrefattValue == null || hrefattValue.isEmpty()) {

                System.out.println("As href value is not there cant find out broken Linkls");
                continue;
            }


            URL linkURL = new URL(hrefattValue);

            HttpURLConnection con = (HttpURLConnection) linkURL.openConnection();
            con.connect();


        }

    }}
