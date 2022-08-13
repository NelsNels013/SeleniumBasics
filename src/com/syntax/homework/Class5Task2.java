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
import java.util.concurrent.TimeUnit;

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
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement firstName = driver.findElement(By.xpath("//input[@name = 'firstname']"));
        firstName.sendKeys("Mante");
        WebElement lastName = driver.findElement(By.xpath("//input[@name = 'lastname']"));
        lastName.sendKeys("Quilla");
        WebElement mobileNum = driver.findElement(By.xpath("//input[@name = 'reg_email__']"));
        mobileNum.sendKeys("2408763454");
        WebElement password = driver.findElement(By.xpath("//input[@autocomplete = 'new-password']"));
        password.sendKeys("dbvudw4536");

        WebElement monthDD = driver.findElement(By.id("month"));
        Select selectMonth = new Select(monthDD);
        selectMonth.selectByVisibleText("Jul");

        WebElement dayDD = driver.findElement(By.id("day"));
        Select selectDay = new Select(dayDD);
        selectDay.selectByValue("2");

        WebElement yearDD = driver.findElement(By.id("year"));
        Select selectYear = new Select(yearDD);
        selectYear.selectByVisibleText("1998");

        driver.findElement(By.xpath("//label[text() = 'Male']")).click();

        driver.findElement(By.cssSelector("button[class = '_6j mvm _6wk _6wl _58mi _3ma _6o _6v']")).click();

    }
}
