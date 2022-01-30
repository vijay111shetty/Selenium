package api;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class restapi {

	
	@Test
	public void restass() {
		RestAssured.baseURI="https://reqres.in";
		RequestSpecification httpreq=RestAssured.given();
		Response res=httpreq.request(Method.GET,"/api/users?page=2");
		String resbody=res.getBody().asString();
		res.getBody().asInputStream();
		InputStream i = res.body().asInputStream();
		System.out.println(i);
		HashMap<String,String> e=new HashMap<String,String>(); 
		System.out.println(e);
		System.out.println(resbody);
		int rescode=res.getStatusCode();
		System.out.println(rescode);
		String a=resbody.toString();
		System.out.println(resbody);		
		
	}

	
}
