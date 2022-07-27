package com.syntax.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2Task2 {

    /*
    navigate to fb.com
click on create new account
fill up all the textboxes
click on sign up button
close the pop up
close the browser
     */

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
        WebElement mobileNum = driver.findElement(By.xpath("//input[@name = 'reg_email__']"));
        mobileNum.sendKeys("2408763454");
        WebElement password = driver.findElement(By.xpath("//input[@aria-label = 'New password']"));
        password.sendKeys("Mante013dv!ex34522");
        driver.findElement(By.xpath("//button[text() = 'Sign Up']")).click();
        driver.findElement(By.xpath("//img[@class = '_8idr img']")).click();
        driver.close();



    }
}
