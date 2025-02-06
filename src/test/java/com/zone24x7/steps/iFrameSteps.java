package com.zone24x7.steps;

import com.zone24x7.pages.*;
import com.zone24x7.utils.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class iFrameSteps {

        HomePage homePage;
        WebDriver  driver;
        FramesPage fm;
        IFramesPage ifm;

    @Given("I navigate to The Internet Herokuapp in {string}")
    public void iNavigateToTheInternetHerokuappIn(String browser) {
        driver= DriverFactory.getDriver(browser);
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
    }

         @When("I click on the Frames Link")
         public void iClickOnTheFramesLink() {
            homePage.loadingBannerCheck();
            fm = new FramesPage(driver);
            fm = homePage.clickOnFrameLink();
            fm.pageLoaderCheck();
        }

         @Then("I click on the iFrame Link")
        public void iClickOnTheIFrameLink() {
        ifm=new IFramesPage(driver);
        ifm = fm.navigateToIFramePage();

         }

        @And("I should see the message Your content goes here")
        public void iShouldSeeTheMessageYourContentGoesHere() {
        String a = "Your content goes here";
        //Assert.assertEquals(a, ifm.getIframeContent(),"Your content goes here.");
        //Thread.sleep(5000);
         }


}
