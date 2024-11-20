package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class RSATest {


    @Test
    public  void HomePageCheck() throws URISyntaxException, MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
       // caps.setBrowserName("firefox");

        caps.setCapability(CapabilityType.BROWSER_NAME, "firefox");
        WebDriver driver= new RemoteWebDriver(new URI("http://10.0.0.142:4444").toURL(), caps);
        driver.get("http://rahulshettyacademy.com");
        System.out.println(driver.getTitle());
        //driver.findElement(By.name("q")).sendKeys("rahul shetty");
        driver.close();

    }
}