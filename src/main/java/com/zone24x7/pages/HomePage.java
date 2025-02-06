package com.zone24x7.pages;

import com.zone24x7.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private final By banner_Txt = By.xpath("//h1[@class='heading']");
    private final By dropDown_Lnk = By.xpath("//a[contains(text(),'Dropdown')]");
    private final By jsAlert_Lnk = By.xpath("//a[contains(text(),'JavaScript Alerts')]");
    private final By iFrame_Link = By.xpath("//a[contains(text(),'Frames')]");
    private final By drag_drop_Link = By.xpath("//a[contains(text(),'Drag and Drop')]");

    public HomePage(WebDriver uiDriver){
        super(uiDriver);
    }

    public void loadingBannerCheck(){
        super.waitForElementToBeVisible(banner_Txt);
    }


    public FramesPage clickOnFrameLink(){
        super.waitForElementToBeVisible(iFrame_Link).click();
        return new FramesPage(uiDriver);
    }

    public DragAndDropPage ClickOnDragAndropLink(){
        super.waitForElementToBeVisible(drag_drop_Link).click();
        return new DragAndDropPage(uiDriver);
    }
}
