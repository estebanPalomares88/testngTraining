package org.example.stepdef.api;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class APIAuthStepDef {

    @Given("I have a AUTH Request")
    public void iHaveAAUTHRequest() {
    }

    @When("I GET the Bearer endpoint status {int}")
    public void iGETTheBearerEndpointStatus(int statusCode) {
    }

    @Then("I verify the Bearer response")
    public void iVerifyTheBearerResponse() {
    }

    @Given("I have a unauthorized Request")
    public void iHaveAUnauthorizedRequest() {
    }

    @Then("I verify the Bearer response is empty")
    public void iVerifyTheBearerResponseIsEmpty() {
    }
}
