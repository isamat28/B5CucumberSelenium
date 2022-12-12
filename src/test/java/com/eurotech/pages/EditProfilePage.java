package com.eurotech.pages;

import com.eurotech.utulities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class EditProfilePage extends BasePage{

    @FindBy(id = "editprofile-from-status-select")
    public WebElement selectBox;

    public void selectMenu(String type){
        BrowserUtils.waitFor(2);
        Select select = new Select(selectBox);
        select.selectByValue(type);
    }
}
