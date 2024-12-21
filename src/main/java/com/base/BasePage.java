package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
If you have WebDriver APIs in your test
methods, You're Doing it wrong
-Simon Stewart
 */

public class BasePage {

    public static WebDriver driver;

    public void setDriver(WebDriver driver) {
        BasePage.driver = driver;
    }

    /*
    find and return a web element
     */
    protected WebElement find(By locator) {
        return driver.findElement(locator);
    }

    /*
    find the element and pass the text
     */
    protected void set(By locator, String text) {
        find(locator).clear();
        find(locator).sendKeys(text);
    }

    protected void click(By locator) {
        find(locator).click();
    }

    public static void delay(int miliSeconds) {
        try {
            Thread.sleep(miliSeconds);
        } catch (InterruptedException exc) {
            exc.printStackTrace();
        }
    }
}
