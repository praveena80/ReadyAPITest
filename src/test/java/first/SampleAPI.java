package first;


import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

/*
 * @author prave
 * given() --> content type, set cookies, add auth, add param, set headers infor etc...
 * 
 * https://reqres.in/
 * /api/users/2
 * 
 * post - end point /api/users
 * 
 * PUT - end point /api/users/2
 * {
    "name": "morpheus",
    "job": "zion resident"
 *	}
 * 
 * 
 * When() --> requests - get, post, put, delete
 * 
 * Then() --> validae status code, extract response, extract headers cookies & response body ...
 *
 */


public class SampleAPI {
	
//	@Test
//	void getUsersList() {
//
//		given()
//
//		.when()
//			.get("https://reqres.in/api/users?page=2")
//
//		.then()
//			.statusCode(200)
//			.body("page",equalTo(2))
//			.log().all();
//	}
    @Test
    public static void getResponseBody(){
        given().when().get("http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1").then().log()
            .all();

    }


}
