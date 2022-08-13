package com.syntax.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldDemo {

    public static String url = "https://jqueryui.com/droppable/";


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));

        Actions action = new Actions(driver);
        // if more than one action, use build and then perform
        // build() will combine all the actions into one
        action.clickAndHold(draggable).moveToElement(droppable).release().build().perform();

        driver.navigate().refresh();
    }
}
