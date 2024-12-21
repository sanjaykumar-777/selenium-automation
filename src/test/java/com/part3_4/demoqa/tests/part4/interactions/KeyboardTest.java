package com.part3_4.demoqa.tests.part4.interactions;

import com.part3_4.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeyboardTest extends BaseTest {
    @Test
    public void testApplicationUsingKeyboard() {
        var textBoxPage = homePage.goToElements().clickTextBox();
        textBoxPage.setFullName("Sanjay Kumar");
        textBoxPage.setEmail("sanjaykumar7m7@gmail.com.com");
        textBoxPage.setCurrentAddress("1234 Selenium Avenue");
        textBoxPage.setCurrentAddress("Suite 3400");
        textBoxPage.setCurrentAddress("Chennai, Tamil Nadu");
        textBoxPage.clickSubmitButton();
        String actualAddress = textBoxPage.getCurrentAddress();
        Assert.assertTrue(actualAddress.contains("Suite 3400"),
                "\n Actual Address Does Not Contain Suite 3400 \n");
    }
}
