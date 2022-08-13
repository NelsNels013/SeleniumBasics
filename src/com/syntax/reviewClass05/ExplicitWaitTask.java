package com.syntax.reviewClass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ExplicitWaitTask {

    public static String url = "https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        WebDriverWait wait = new WebDriverWait(driver, 20);

        WebElement button = driver.findElement(By.xpath("//button[text() = 'Display button after 10 seconds']"));
        button.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text() = 'Enabled']")));
        WebElement enabled = driver.findElement(By.xpath("//button[text() = 'Enabled']"));
        enabled.click();
    }
}