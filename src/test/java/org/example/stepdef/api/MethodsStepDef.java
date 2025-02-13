package org.example.stepdef.api;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.example.api.controller.MethodsController;
import org.example.api.rest.dto.BodyExample;

import static org.assertj.core.api.Assertions.assertThat;

public class MethodsStepDef {

    private BodyExample payload = null;
    private final MethodsController methodsController = new MethodsController();
    private Response response;

    @Given("user has a Body Request")
    public void userHasABodyRequest() {
        this.payload = new BodyExample("John","Doe",35);
    }

    @When("user {string} the endpoint")
    public void userTheEndpoint(String method) {
        this.response = this.methodsController.executeMethod(method,this.payload);
    }

    @Then("user verify the {int} status code")
    public void userVerifyTheStatusCode(int statusCode) {
        assertThat(this.response).isNotNull();
        assertThat(this.response.statusCode()).isEqualTo(statusCode);
    }

    @When("user {string} the {string} endpoint")
    public void userTheEndpoint(String method, String endpoint) {
        this.response = this.methodsController.executeMethodWithEndpoint(method, endpoint);
    }
}
