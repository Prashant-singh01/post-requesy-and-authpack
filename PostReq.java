package PostRequest;


import java.nio.charset.StandardCharsets;

import Authentication.Authpack;
import io.restassured.RestAssured;
import io.restassured.config.EncoderConfig;
import io.restassured.http.ContentType;
import io.restassured.response.Response;



public class PostReq {
	
	public static void main(String[] args) {
		checkstatus_Code();
	}
	public static void checkstatus_Code()
	{
		Response res = Authpack.auth();
		System.out.println(res.statusCode());
		
	}

}
