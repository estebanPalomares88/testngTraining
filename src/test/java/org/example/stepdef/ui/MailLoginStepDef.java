package org.example.stepdef.ui;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.ui.controller.LoginPageController;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MailLoginStepDef {

    private final LoginPageController loginPageController = new LoginPageController();

    @Given("User opens the website")
    public void user_opens_the_website() {
        this.loginPageController.goToLoginPage();
    }

    @When("User uses {string} credentials")
    public void user_uses_credentials(String scenario) throws InterruptedException {
        this.loginPageController.sendCredentials(scenario);
    }

    @Then("User in logged")
    public void user_in_logged() {
        assertThat(this.loginPageController.getTittleInventory()).isEqualTo("Swag Labs");
        this.loginPageController.closeLoginPage();
    }

}
