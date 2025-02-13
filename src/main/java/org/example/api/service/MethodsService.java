package org.example.api.service;

import io.restassured.response.Response;
import org.example.api.rest.HttpClient;

public class MethodsService {

    public Response httpMethods(String method, Object payload) {
        final String basePath = "/" + method.toLowerCase();
        Response response = null;

        switch (method) {
            case "GET":
                response = HttpClient.getMethod(basePath, payload);
                break;
            case "POST":
                response = HttpClient.postMethod(basePath, payload);
                break;
            case "PUT":
                response = HttpClient.putMethod(basePath, payload);
                break;
            case "PATCH":
                response = HttpClient.patchMethod(basePath, payload);
                break;
            case "DELETE":
                response = HttpClient.deleteMethod(basePath, payload);
                break;
            default:
                break;
        }
        return response;
    }

    public Response executeMethodOnEndpoint(String method, String endpoint){
        Response response = null;
        String basePath = "/" + endpoint.toLowerCase();

        switch (method) {
            case "GET":
                response = HttpClient.getMethod(basePath);
                break;
            case "POST":
                response = HttpClient.postMethod(basePath);
                break;
            case "PUT":
                response = HttpClient.putMethod(basePath);
                break;
            case "PATCH":
                response = HttpClient.patchMethod(basePath);
                break;
            case "DELETE":
                response = HttpClient.deleteMethod(basePath);
                break;
            default:
                break;
        }

        return response;
    }

}
