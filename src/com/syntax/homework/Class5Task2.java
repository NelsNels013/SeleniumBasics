package com.syntax.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

/*
Go to facebook sign up page
Fill out the whole form
Click signup
 */

public class Class5Task2 {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        driver.findElement(By.xpath("//a[text() = 'Create new account']")).click();
        Thread.sleep(2000);
        WebElement firstName = driver.findElement(By.xpath("//input[@name = 'firstname']"));
        firstName.sendKeys("Mante");
       // WebElement lastName = driver.findElement();


    }
}
