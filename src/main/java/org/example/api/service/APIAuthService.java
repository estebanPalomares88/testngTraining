package org.example.api.service;

import io.restassured.response.Response;
import org.example.api.rest.HttpClient;

public class APIAuthService {

    public Response getMethod(String token){
        return HttpClient.getMethodWithToken(token);
    }

}
