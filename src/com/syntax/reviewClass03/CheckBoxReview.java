package com.syntax.reviewClass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxReview {
    public static String url = "https://www.ironspider.ca/forms/checkradio.htm";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        //get all the checkboxes in a list
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@name = 'color']"));

        //loop through
        for(WebElement checkBox : checkBoxes){
            String color = checkBox.getAttribute("value");
            //make a selection if the color is purple
            if (color.equalsIgnoreCase("purple"));
            checkBox.click();
        }

    }
}
