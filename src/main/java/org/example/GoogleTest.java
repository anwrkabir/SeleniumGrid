package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class GoogleTest {


    @Test
    public  void HomePageCheck() throws URISyntaxException, MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName("chrome");

        //caps.setCapability(CapabilityType.BROWSER_NAME, "chrome");
        WebDriver driver= new RemoteWebDriver(new URI("http://10.0.0.142:4444").toURL(), caps);
        driver.get("http://google.com");
        System.out.println(driver.getTitle());
        driver.findElement(By.name("q")).sendKeys("rahul shetty");
        driver.close();

    }
}