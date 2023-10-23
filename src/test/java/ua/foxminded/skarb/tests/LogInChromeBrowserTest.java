package ua.foxminded.skarb.tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInChromeBrowserTest {
    @Test
    public void logInTestCh() {
        System.out.println("Starting logInTest");

        //Create driver WebDriver
        WebDriver driver = new ChromeDriver();

        //sleep
        sleep(3000);

        //maximize browser window
        driver.manage().window().maximize();

        //open test page
        String url = "https://skarb.foxminded.ua/login";
        driver.get(url);
        System.out.println("Page is open");

        //enter logIn
        WebElement login = driver.findElement(By.id("login"));
        login.sendKeys("Example");
        System.out.println("Login is typing");

        //enter password
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("WhatEver");
        System.out.println("Password is typing");

        //sleep
        sleep(2000);

        //Close browser
        driver.quit();


    }
    private void sleep(long m) {
        try {
            Thread.sleep(m);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
