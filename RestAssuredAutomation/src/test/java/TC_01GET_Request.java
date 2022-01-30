import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class TC_01GET_Request {
	@Test
	public void GETReq() {
		// RestAssured.baseURI="https://reqres.in/";
		// Specify the base URI
		RestAssured.baseURI = "https://reqres.in";
		// Request object
		RequestSpecification httprequest = RestAssured.given();
		// Response object
		Response response = httprequest.request(Method.GET, "/api/users?page=2");
		// "/api/users?page=2"--->Path Parameter
		// Print the response in console window
		String responseBody = response.getBody().asString();
		System.out.println(responseBody);
		System.out.println(response);
		// Status code
		int statuscode = response.getStatusCode();
		System.out.println(statuscode);
		Assert.assertEquals(statuscode, 200);
		// Status line verification
		String statusline = response.getStatusLine();
		System.out.println(statusline);
		Assert.assertEquals(statusline, "HTTP/1.1 200 OK");
	}

	@Test
	public void POSTreq() {
		RestAssured.baseURI = "https://reqres.in";
		RequestSpecification httprequest = RestAssured.given();
		// Response object in the form of jason
		// Request paylode along with post request
		JSONObject requestparams = new JSONObject();
		requestparams.put("name", "vijay");
		requestparams.put("job", "TestEngineer");
		Response response = httprequest.request(Method.POST, "/api/users");
		httprequest.header("Content-Type", "application/json");
		httprequest.body(requestparams.toJSONString());
		// Response object
		Response response1 = httprequest.request(Method.POST, "/api/users");
		String responsebody = response1.getBody().asString();
		System.out.println(responsebody);
		int responsecode1 = response1.getStatusCode();
		Assert.assertEquals(responsecode1, 201);
		System.out.println(responsecode1);
		String statuslline1 = response1.getStatusLine();
		System.out.println(statuslline1);
	}

	@Test
	public void GETreq() {
		RestAssured.baseURI = "https://reqres.in";
		RequestSpecification httpreq = RestAssured.given();
		Response response = httpreq.request(Method.GET, "/api/unknown");
		String responseBody = response.getBody().asString();
		System.out.println(responseBody);
		int responcod = response.getStatusCode();
		System.out.println(responcod);
		// String contenttype=response.header(responseBody)
	}

}
