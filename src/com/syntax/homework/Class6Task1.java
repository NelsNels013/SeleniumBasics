package com.syntax.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Class6Task1 {
    /*
    Navigate to https://syntaxprojects.com/bootstrap-iframe.php
verify the header text Sorry, We Couldn't Find Anything For “Asksn” is displayed
verify enroll today button is enabled
     */

    public static String url = "https://syntaxprojects.com/bootstrap-iframe.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.switchTo().frame("FrameOne");

        WebElement header = driver.findElement(By.xpath("//h1[@class = 'heading-13']"));
        boolean headerIsDisplayed = header.isDisplayed();

        if(headerIsDisplayed){
            System.out.println("Header text is displayed "+"'Sorry, We couldn't Find Anything For Asksn'");
        }else{
            System.out.println("Header test is not displayed");
        }

        driver.switchTo().defaultContent();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.switchTo().frame("FrameTwo");

        WebElement enroll = driver.findElement(By.xpath("//div[@class = 'text-block-2']"));
        boolean enrollDisplayed = enroll.isEnabled();

        if (enrollDisplayed) {
            System.out.println("Enroll button is enabled");
        }else {
            System.out.println("Enroll button is not enabled");
        }
    }
}
