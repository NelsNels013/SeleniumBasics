package com.syntax.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class4Task3 {

    /*
    Open chrome browser
Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
Enter valid username
Leave password field empty
Click on login button
Verify error message with text “Password cannot be empty” is displayed.
     */

    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        WebElement username = driver.findElement(By.cssSelector("input[name = 'txtUsername']"));
        username.sendKeys("Mantequilla");
        driver.findElement(By.cssSelector("input[value = 'LOGIN']")).click();
        WebElement errorMessage = driver.findElement(By.xpath("//span[text() = 'Password cannot be empty']"));
        errorMessage.isDisplayed();

        if(errorMessage.isDisplayed()){
            System.out.println("Password cannot be empty");
        }
    }

}
