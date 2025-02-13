package org.example.stepdef.api;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.cdimascio.dotenv.Dotenv;
import io.restassured.response.Response;
import org.example.api.controller.APIAuthController;
import org.example.api.rest.dto.APIAuthDto;

import static org.assertj.core.api.Assertions.assertThat;

public class APIAuthStepDef {

    private final  Dotenv env = Dotenv.load();
    private String token = null;
    private Response response;
    private APIAuthController controller = new APIAuthController();

    @Given("I have a AUTH Request")
    public void iHaveAAUTHRequest() {
        this.token = env.get("API_TOKEN");
    }

    @When("I GET the Bearer endpoint status {int}")
    public void iGETTheBearerEndpointStatus(int statusCode) {
        this.response = this.controller.executeGetWithToken(this.token);
        assertThat(this.response).isNotNull();
        assertThat(this.response.statusCode()).isEqualTo(statusCode);
    }

    @Then("I verify the Bearer response")
    public void iVerifyTheBearerResponse() {
        APIAuthDto dto = this.response.as(APIAuthDto.class);
        assertThat(dto.getToken()).isEqualTo(this.token);
        assertThat(dto.getAuthenticated()).isEqualTo("true");
    }

    @Given("I have a unauthorized Request")
    public void iHaveAUnauthorizedRequest() {
        this.token = "";
    }

    @Then("I verify the Bearer response is empty")
    public void iVerifyTheBearerResponseIsEmpty() {
        assertThat(this.response.asString()).isNullOrEmpty();
    }
}
