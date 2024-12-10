package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownUtility extends Utility{

    /*
    declaring it as private - this method can only be used
    within this class
     */
    private static Select findDropDown(By locator){
        return new Select(driver.findElement(locator));
    }

    /*
    declaring it as public - this method can be used
    across the classes and packages
     */
    public static void selectByVisibleText(By locator, String text) {
        findDropDown(locator).selectByVisibleText(text);
    }
    public static void selectByIndex(By locator, int index) {
        findDropDown(locator).selectByIndex(index);
    }
    public static void selectByValue(By locator, String value) {
        findDropDown(locator).selectByValue(value);
    }
    public static void deselectByValue(By locator, String value) {
        findDropDown(locator).deselectByValue(value);
    }
    public static List<String> getAllSelectedOptions(By locator) {
        List<WebElement> allSelectedOptions =
                findDropDown(locator).getAllSelectedOptions();
        return allSelectedOptions.stream().
                map(WebElement::getText).collect(Collectors.toList());
    }

}
