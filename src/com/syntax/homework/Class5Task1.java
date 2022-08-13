package com.syntax.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Class5Task1 {

    /*
    Open chrome browser
Go to “https://www.facebook.com”
click on create new account
Verify:
month dd has 12 month options
day dd has 31 day options
year dd has 115 year options
Select your date of birth
Quit browser
     */


    public static String url = "https://www.facebook.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.findElement(By.xpath("//a[text() = 'Create new account']")).click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement monthsDD = driver.findElement(By.id("month"));
        Select selectMonth = new Select(monthsDD);
        int sizeMonth = selectMonth.getOptions().size();
        System.out.println(sizeMonth);

        WebElement dayDD = driver.findElement(By.id("day"));
        Select selectDay = new Select(dayDD);
        int sizeOfDays =selectDay.getOptions().size();
        System.out.println(sizeOfDays);

        WebElement yearDD = driver.findElement(By.id("year"));
        Select selectYear = new Select(yearDD);
        int sizeOfYears =  selectYear.getOptions().size();
        System.out.println(sizeOfYears);

        selectMonth.selectByVisibleText("Jul");

        selectDay.selectByValue("2");

        selectYear.selectByValue("1998");
    }
}
