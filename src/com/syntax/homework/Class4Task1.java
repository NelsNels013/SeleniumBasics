package com.syntax.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class4Task1 {

    /*
    Open Chrome browser
Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
Enter valid username and password (username - Admin, password - Hum@nhrm123)
Click on login button
Then verify Syntax Logo is displayed. if condition
     */

    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        WebElement userName = driver.findElement(By.cssSelector("input[name = 'txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.cssSelector("input[type = 'password']"));
        password.sendKeys("Hum@nhrm123");
        driver.findElement(By.cssSelector("input[value = 'LOGIN']")).click();
        WebElement logo = driver.findElement(By.cssSelector("img[src = '/humanresources/symfony/web/webres_5acde3dbd3adc6.90334155/themes/default/images/syntax.png']"));
        logo.isDisplayed();
        if(logo.isDisplayed()){
            System.out.println("The Syntax logo is being displayed");
        }
        driver.close();
    }

}
