package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCommand {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("http://syntaxprojects.com/basic-radiobutton-demo.php");
        WebElement ageRadioButton = driver.findElement(By.cssSelector("input[value = '5 - 15']"));
        boolean isAgeRadioButton = ageRadioButton.isEnabled();
        System.out.println(isAgeRadioButton);

        boolean isAgeRadioButtonDisplayed = ageRadioButton.isDisplayed();
        System.out.println(isAgeRadioButtonDisplayed);

        boolean isAgeRadioButtonSelected = ageRadioButton.isSelected(); //check if it is selected
        System.out.println("Before clicking "+isAgeRadioButtonSelected); //false

        ageRadioButton.click();

        isAgeRadioButtonSelected = ageRadioButton.isSelected();

        System.out.println("After clicking "+isAgeRadioButtonSelected);

        driver.quit();
    }
}
