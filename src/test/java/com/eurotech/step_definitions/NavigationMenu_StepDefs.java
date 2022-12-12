package com.eurotech.step_definitions;

import com.eurotech.pages.DashboardPage;
import com.eurotech.utulities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class NavigationMenu_StepDefs {
    DashboardPage dashboardPage = new DashboardPage();
    @Then("The user should be able to sees welcome message")
    public void the_user_should_be_able_to_sees_welcome_message() {
        System.out.println("I see welcome message");
    }
    @Then("The user navigates to Developer menu")
    public void the_user_navigates_to_developer_menu() {
        dashboardPage.navigateToMenu("Developers");
    }

    @Then("The user able to see developer text")
    public void the_user_able_to_see_developer_text() {
        System.out.println("I see developer text");
    }

    @And("The user navigates to All Post menu")
    public void theUserNavigatesToAllPostMenu() {
        System.out.println("I navigating All post menu");
    }

    @Then("The user able to see Posts text")
    public void theUserAbleToSeePostsText() {
        System.out.println("I see Posts text");
    }

    @And("The user navigates to My Account menu")
    public void theUserNavigatesToMyAccountMenu() {
        System.out.println("I navigating My Account menu");
    }

    @Then("The user able to see dashboard text")
    public void theUserAbleToSeeDashboardText() {
        System.out.println("I see dashboard text");
    }
    @Then("The user navigates to {string} menu")
    public void the_user_navigates_to_menu(String menuName) {
        dashboardPage.navigateToMenu(menuName);
    }

    @Then("The user should be able to see header as {string} message")
    public void theUserShouldBeAbleToSeeHeaderAsMessage(String headerName) {
        BrowserUtils.waitFor(2);
        String actualHeader=dashboardPage.getHeaderText(headerName);
        Assert.assertEquals("verify that header name is displayed",headerName,actualHeader);
    }
}
