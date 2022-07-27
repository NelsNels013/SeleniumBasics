package com.syntax.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class Class4Task2 {

    /*
    Open Chrome browser
Go to “https://www.amazon.com/”
Get all links
Get number of links that has text
Print to console only the links that has text
     */

    public static String url = "https://www.amazon.com/";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("allLinks = " + allLinks);

        for (WebElement links : allLinks) {
            String linkText = links.getText();
            String fullLink = links.getAttribute("href");
            if(!linkText.isEmpty()){
                System.out.println(linkText+"     "+fullLink);
            }
        }

    }
}
