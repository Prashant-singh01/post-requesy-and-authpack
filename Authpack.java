package Authentication;

import java.nio.charset.StandardCharsets;

import io.restassured.RestAssured;
import io.restassured.config.EncoderConfig;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Authpack {
	
	public static Response auth()
	{

Response response = RestAssured.given()
.config(RestAssured.config()
.encoderConfig(EncoderConfig.encoderConfig()
.encodeContentTypeAs("x-www-form-urlencoded", ContentType.URLENC)))
.contentType(ContentType.URLENC.withCharset(StandardCharsets.UTF_8))
.when().post("https://reqres.in/api/login").then().extract().response();

return response;
		
	}

}
