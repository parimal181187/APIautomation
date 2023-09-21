package com.apitest.mavenproject;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static org.junit.Assert.assertEquals;
import java.util.List;
import java.util.Map;

/**
 * API Validation using RestAssured,TestNG and Maven dependencies.
 */

public class AppTest {
	String myAPIURL = "https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false";

	@Test
	public void test() {

		Response apiResponse = given().get(myAPIURL);
		assertEquals(200, apiResponse.getStatusCode());
		String jsonResponsefromAPI = apiResponse.asString();
		JsonPath jp = new JsonPath(jsonResponsefromAPI);
		/* Verification for AC 1 and AC 2 */
		assertEquals("Carbon credits", jp.get("Name"));
		assertEquals(true, jp.get("CanRelist"));
		List<Map<String, String>> id = apiResponse.jsonPath().getList("Promotions");
		/* Verification for AC 3 */
		for (int i = 0; i < id.size(); i++) {
			Map<String, String> pickRecordValueAsPerID = id.get(i);
			String validateName = pickRecordValueAsPerID.get("Name");
			if (validateName.equals("Gallery")) {
				String validateDescription=pickRecordValueAsPerID.get("Description");
				assertEquals("Good position in category",validateDescription);
				System.out.println(
						"Hey User!!MyTest is complete.Validated by taking each record in loop and when i found Gallery as Name,i have gone ahead and checked that description is as per the AC point 3 and then i stepped out of the loop and halted loop execution");
				break;
			}

		}

	}

}
