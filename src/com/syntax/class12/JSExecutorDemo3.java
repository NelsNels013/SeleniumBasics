package com.syntax.class12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutorDemo3 {

    public static String url = "http://google.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.open('http//www.amazon.com')");

        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("Mantequilla");

    }
}
