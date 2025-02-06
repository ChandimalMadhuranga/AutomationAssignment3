package com.zone24x7.pages;

import com.zone24x7.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IFramesPage extends BasePage {

    private final By iframeLocator = By.xpath("//iframe[@title='Rich Text Area']"); // css : iframe[title='Rich Text Area']
    private final By iframeContentLocator = By.xpath("//body[@id='tinymce']"); // Element inside the iframe

    public IFramesPage(WebDriver driver) {
        super(driver);
    }
    /*
    * Method to switch iFrame
    * */
    private void switchToIframe() {
        WebElement iframeElement = super.waitForElementToBeVisible(iframeLocator);
        uiDriver.switchTo().frame(iframeElement); // Switch to iframe context
    }

    /*
    * Method to get content inside the iframe
    * */
    public String getIframeContent() {
        switchToIframe(); // Switch to iframe first
        String content = uiDriver.findElement(iframeContentLocator).getText(); // Get text inside iframe
        uiDriver.switchTo().defaultContent(); // Switch back to main content
        return content;
    }

}
