/*
package com.wipro.webservice.appassure;

import java.io.IOException;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

import static com.wipro.webservice.appassure.ReportPortalGlobal.*;

public class APIRequest {

	@SuppressWarnings("deprecation")
	public static void post_StartLaunch() throws IOException {
		RestAssured.baseURI=getBaseURI();

		PostLaunchID = given()
				.header("Content-Type","application/json")
				.queryParameter("access_token", getUserUUID())
				.body(PayLoads.startLaunch())
				.when()
				.post("/"+getProjectName()+"/launch")
				.then()
				.log().body()
				.statusCode(201)
				.extract()
				.path("id");
		Logs.info("Launch created. Launch id is: "+PostLaunchID);
	}

	@SuppressWarnings("deprecation")
	public static void post_StartTest() throws IOException {
		RestAssured.baseURI=getBaseURI();

		PostTestID = given()
				.header("Content-Type","application/json")
				.queryParameter("access_token", getUserUUID())
				.body(PayLoads.startTest())
				.when()
				.post("/"+getProjectName()+"/item")
				.then()
				.log().body()
				.statusCode(201)
				.extract()
				.path("id");
		Logs.info("Suite created. suite id is: "+PostTestID);
	}

	@SuppressWarnings("deprecation")
	public static void post_StartStep() throws IOException {
		RestAssured.baseURI=getBaseURI();

		PostStepID = given()
				.header("Content-Type","application/json")
				.queryParameter("access_token", getUserUUID())
				.body(PayLoads.startStep())
				.when()
				.post("/"+getProjectName()+"/item/"+PostTestID)
				.then()
				.log().body()
				.statusCode(201)
				.extract()
				.path("id");
		Logs.info("Test created. test id is: "+PostStepID);
	}

	@SuppressWarnings("deprecation")
	public static void post_Log() throws IOException {
		RestAssured.baseURI=getBaseURI();

		given()
				.header("Content-Type","application/json")
				.queryParameter("access_token", getUserUUID())
				.body(PayLoads.postLogs())
				.when()
				.post("/"+getProjectName()+"/log")
				.then()
				.log().body()
				.statusCode(201);
		Logs.info("Test logs entered");
	}

	@SuppressWarnings("deprecation")
	public static void put_Step() throws IOException {
		RestAssured.baseURI=getBaseURI();

		given()
		.header("Content-Type","application/json")
		.queryParameter("access_token", getUserUUID())
		.body(PayLoads.finishStep())
		.when()
		.put("/"+getProjectName()+"/item/"+PostStepID)
		.then()
		.log().body()
		.statusCode(200);
		Logs.info("Test details updated and completed");
	}

	@SuppressWarnings("deprecation")
	public static void put_Test() throws IOException {
		RestAssured.baseURI=getBaseURI();

		given()
		.header("Content-Type","application/json")
		.queryParameter("access_token", getUserUUID())
		.body(PayLoads.finishTest())
		.when()
		.put("/"+getProjectName()+"/item/"+PostTestID)
		.then()
		.log().body()
		.statusCode(200);
		Logs.info("Suite details updated and completed");
	}

	@SuppressWarnings("deprecation")
	public static void put_Launch() throws IOException {
		RestAssured.baseURI=getBaseURI();

		given()
		.header("Content-Type","application/json")
		.queryParameter("access_token", getUserUUID())
		.body(PayLoads.finishLaunch())
		.when()
		.put("/"+getProjectName()+"/launch/"+PostLaunchID+"/finish")
		.then()
		.log().body()
		.statusCode(200);
		Logs.info("Launch details updated and completed");
	}
}
*/
