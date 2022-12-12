package com.eurotech.step_definitions;

import com.eurotech.pages.DashboardPage;
import com.eurotech.pages.EditProfilePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditProfile_StepDefs {
 DashboardPage dashboardPage=new DashboardPage();
 EditProfilePage editProfilePage=new EditProfilePage();
    @When("The user navigates to {string}")
    public void the_user_navigates_to(String module) {
    dashboardPage.navigateToMenu(module);
    }

    @When("The user select status{string}")
    public void theUserSelectStatus(String type) {
        editProfilePage.selectMenu(type);
    }
    @When("The user slides the slider")
    public void the_user_slides_the_slider() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("The user add {string} {string}")
    public void the_user_add(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The user click on the submit button")
    public void the_user_click_on_the_submit_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
