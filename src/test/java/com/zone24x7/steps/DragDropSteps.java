package com.zone24x7.steps;

import com.zone24x7.pages.DragAndDropPage;
import com.zone24x7.pages.HomePage;
import com.zone24x7.utils.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class DragDropSteps {

    HomePage homePage;
    WebDriver driver;
    DragAndDropPage dragAndDropPage;

    @Given("I navigate to The Internet Herokuappp in {string}")
    public void iNavigateToTheInternetHerokuapppIn(String browser) {
        driver= DriverFactory.getDriver(browser);
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
    }


        @When("I click on the Drag and Drop link")
        public void iClickOnTheDragAndDropLink() {
            homePage.loadingBannerCheck();
            dragAndDropPage = new DragAndDropPage(driver);
            dragAndDropPage = homePage.ClickOnDragAndropLink();
        }

        @Then("I drag the object B onto the object A position")
        public void iDragTheObjectBOntoTheObjectAPosition() {
            dragAndDropPage.pageLoaderCheck();
            dragAndDropPage.dragAndDrop();
        }

        @And("I should see object B in object A position successfully")
        public void iShouldSeeObjectBInObjectAPositionSuccessfully() {
        dragAndDropPage.verifyDragAndDrop("A","B");
        }



}
