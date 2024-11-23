package com.part3_4.demoqa.tests.part3.forms;

import com.part3_4.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest extends BaseTest {

    @Test
    public void testRadioButton(){
    var formsPage = homePage.goToForms().clickPracticeForm();
    formsPage.clickFemaleRadioButton();
    boolean isFemaleRadioButtonSelected = formsPage.isFemaleSelected();
    Assert.assertTrue(isFemaleRadioButtonSelected,"Female Radio Button Not Selected");
    }


}
