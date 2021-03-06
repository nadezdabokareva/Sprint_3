package com.ya.RestClients;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

import static io.restassured.http.ContentType.JSON;

public abstract class BasicRestClient {

    public static final String BASE_URL = "http://qa-scooter.praktikum-services.ru/";

    public static RequestSpecification getBaseSpec() {
        return new RequestSpecBuilder().setContentType(JSON).setBaseUri(BASE_URL).build();
    }
}
