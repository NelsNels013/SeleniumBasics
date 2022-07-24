package com.syntax.reviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

    public static String url = "https://demo.guru99.com/insurance/v1/register.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //launch the website
        driver.get(url);
        //access the text box surname using absolute xpath
        WebElement surname = driver.findElement(By.xpath("/html/body/div[3]/form/div[2]/div[1]/input"));
        surname.sendKeys("Mantequilla");

        //access the textBox firstname using xpath
        WebElement firstName =driver.findElement(By.xpath("//input[@id = 'user_firstname']"));
        firstName.sendKeys("Mante");

        //access the webElement date of birth and print the text on console
        WebElement dateOfBirth = driver.findElement(By.xpath("//label[text() = 'Date of Birth']"));
        System.out.println(dateOfBirth.getText());

        //access the webElement licence period and print on the console
        WebElement licence = driver.findElement(By.xpath("//label[contains (text(), 'Licence Period')]"));
        System.out.println(licence.getText());

        //access the webElement radio button and click on it
        WebElement radioButton = driver.findElement(By.xpath("//label[text() = 'Full']/following-sibling::input"));
        radioButton.click();

        //access the textBox phone number and send in the number
        WebElement phoneNumber = driver.findElement(By.cssSelector("input#user_phone"));
        phoneNumber.sendKeys("351-988-8856");

        //access the webElement address and send in the address
        WebElement address = driver.findElement(By.cssSelector("input[id *= 'attributes_street']"));
        address.sendKeys("123 Rich Ln");


    }
}
