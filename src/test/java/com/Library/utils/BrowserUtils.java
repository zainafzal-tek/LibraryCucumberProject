package com.Library.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BrowserUtils {

    public static Select getSelectDropdown(WebElement element){
        Select select = new Select(element);
        return select;
    }

}
