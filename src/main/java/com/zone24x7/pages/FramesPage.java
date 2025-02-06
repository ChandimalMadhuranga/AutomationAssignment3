package com.zone24x7.pages;

import com.zone24x7.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage extends BasePage {

    private final By page_header = By.xpath("//h3[contains(text(),'Frames')]");
    private final By iFrame_Lnk = By.xpath("//a[contains(text(),'iFrame')]");

    public FramesPage(WebDriver driver) {
        super(driver);
    }

    public void pageLoaderCheck(){
        super.waitForElementToBeVisible(page_header);
    }

    public IFramesPage navigateToIFramePage(){
        super.waitForElementToBeClickable(iFrame_Lnk).click();
        return new IFramesPage(uiDriver);
    }

}
