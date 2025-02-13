package org.example.api.controller;

import io.restassured.response.Response;
import org.example.api.service.APIAuthService;

public class APIAuthController {

    private final APIAuthService service = new APIAuthService();

    public Response executeGetWithToken(String token) {
        return this.service.getMethod(token);
    }

}
