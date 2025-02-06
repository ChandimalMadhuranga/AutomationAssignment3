package com.zone24x7.pages;

import com.zone24x7.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPage extends BasePage {

    private final By page_header = By.xpath("//h3[contains(text(),'Drag and Drop')]");
    private final By source_path = By.xpath("//div[@id='column-b']");
    private final By source_path_text = By.xpath("//div[@id='column-b']/header");
    private final By target_path = By.xpath("//div[@id='column-a']");
    private final By target_path_text = By.xpath("//div[@id='column-a']/header");



    public DragAndDropPage (WebDriver driver){
        super(driver);
    }
    WebDriver driver;
    public void pageLoaderCheck(){
        super.waitForElementToBeVisible(page_header);
    }

    public void dragAndDrop() {
        WebElement source = uiDriver.findElement(source_path);
        WebElement target = uiDriver.findElement(target_path);
        Actions actions = new Actions(uiDriver);
        actions.dragAndDrop(source, target).perform();
    }

    public void verifyDragAndDrop(String text1, String text2 ){
        WebElement source_text = uiDriver.findElement(source_path_text);
        WebElement target_text = uiDriver.findElement(target_path_text);
        if (!source_text.getText().equals(text1) && !target_text.getText().equals(text2)){
                System.out.println("Drag and drop successfull");
        }
    }

}
