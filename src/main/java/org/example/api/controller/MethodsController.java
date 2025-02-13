package org.example.api.controller;

import io.restassured.response.Response;
import org.example.api.service.MethodsService;

public class MethodsController {

    private final MethodsService service = new MethodsService();

    public Response executeMethod(String method, Object payload) {
        return this.service.httpMethods(method,payload);
    }

    public Response executeMethodWithEndpoint(String method, String endpoint) {
        return this.service.executeMethodOnEndpoint(method, endpoint);
    }

}
