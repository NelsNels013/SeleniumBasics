package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandlingDynamicTables {

    public static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username")); // gettin webelement in return
        username.sendKeys("Tester"); // performing action on the specific element
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        driver.findElement(By.cssSelector("input[class = 'button']")).click();

        List<WebElement> rows = driver.findElements(By.xpath("//table[@class = 'SampleTable']/tbody/tr"));
        for(int i = 1; i < rows.size(); i++){
            String rowText = rows.get(i).getText();
            System.out.println(rowText);
            if(rowText.contains("FamilyAlbum")){
                List<WebElement> checkBoxes = driver.findElements(By.xpath("//table[@class = 'SampleTable']/tbody/tr/td[1]"));
                checkBoxes.get(i - 1).click();
            }
        }
    }
}
