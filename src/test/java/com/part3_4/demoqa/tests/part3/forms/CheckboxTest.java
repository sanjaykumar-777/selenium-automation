package com.part3_4.demoqa.tests.part3.forms;

import com.part3_4.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxTest extends BaseTest {
    @Test
    public void testCheckbox(){
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickSportsCheckbox();
        formsPage.clickReadingCheckbox();
        formsPage.clickMusicCheckbox();
        formsPage.unclickReadingCheckbox();
        boolean isReadingCheckboxSelected = formsPage.isReadingCheckboxSelected();
        Assert.assertFalse(isReadingCheckboxSelected,"Reading Checkbox Is Selected");
    }
}
