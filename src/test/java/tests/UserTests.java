package tests;

import base.BaseTest;
import endpoints.Routes;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class UserTests extends BaseTest{


@Test(priority=1)
public void getUsers(){

given()

.when()
.get(Routes.USERS)

.then()
.statusCode(200)
.body("[0].id",equalTo(1));

}



@Test(priority=2)
public void createUser(){

String payload=
"{\"title\":\"API Test\","
+"\"body\":\"Automation\","
+"\"userId\":1}";


given()
.contentType("application/json")
.body(payload)

.when()
.post(Routes.CREATE)

.then()
.statusCode(201)
.body("title",
equalTo("API Test"));

}



@Test(priority=3)
public void updateUser(){

String payload=
"{\"title\":\"Updated Post\"}";


given()
.contentType("application/json")
.body(payload)

.when()
.put(Routes.UPDATE)

.then()
.statusCode(200);

}



@Test(priority=4)
public void deleteUser(){

when()
.delete(Routes.DELETE)

.then()
.statusCode(200);

}

}