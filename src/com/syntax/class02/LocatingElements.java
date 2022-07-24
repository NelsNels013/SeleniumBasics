package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.fb.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("email@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Password");
        driver.findElement(By.name("login")).click();
        //Thread.sleep(2000);
        driver.findElement(By.linkText("Forgot password?"));
    }
}
