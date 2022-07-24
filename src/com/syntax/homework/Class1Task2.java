package com.syntax.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1Task2 {

    public static String url = "https://www.facebook.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement createButton = driver.findElement(By.linkText("Create new account"));
        createButton.click();
        Thread.sleep(2000);
        WebElement firstName = driver.findElement(By.xpath("//input[@name = 'firstname']"));
        firstName.sendKeys("Mante");
        WebElement lastName = driver.findElement(By.xpath("//input[@name = 'lastname']"));
        lastName.sendKeys("Quilla");

    }
}
