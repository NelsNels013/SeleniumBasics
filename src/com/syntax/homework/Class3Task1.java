package com.syntax.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class3Task1 {

    public static String url = "http://syntaxprojects.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement start = driver.findElement(By.xpath("//a[text() = ' Start Practising ']"));
        start.click();
        Thread.sleep(3000);
        WebElement simpleForm = driver.findElement(By.xpath("//a[text() = 'Check Box Demo']/preceding-sibling::a"));
        simpleForm.click();
        WebElement enter = driver.findElement(By.xpath("//input[contains(@placeholder, 'Message')]"));
        enter.sendKeys("Mantequilla");
        WebElement show = driver.findElement(By.xpath("//button[text() = 'Show Message']"));
        show.click();
        Thread.sleep(3000);
        driver.close();

    }
}
