package org.example.stepdef.api;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MethodsStepDef {

    @Given("user has a Body Request")
    public void userHasABodyRequest() {
    }

    @When("user {string} the endpoint")
    public void userTheEndpoint(String statusCode) {
    }

    @Then("user verify the {int} status code")
    public void userVerifyTheStatusCode(int statusCode) {
    }

    @When("user {string} the {string} endpoint")
    public void userTheEndpoint(String method, String endpoint) {
    }
}
