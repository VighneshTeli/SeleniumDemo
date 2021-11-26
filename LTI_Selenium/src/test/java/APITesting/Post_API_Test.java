package APITesting;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

@Test
public class Post_API_Test {
	public void post_API()
	{
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "Vighnesh");
		map.put("job","Trainee");
		System.out.println("Printing Map "+map);
		
		
		JSONObject requestBody = new JSONObject(map);
		System.out.println("Printing Request Body"+ requestBody);
		System.out.println("Printing Request Body as String"+ requestBody.toJSONString());

		//below is an example of creating JSON request
		//without using Map
		JSONObject newBody = new JSONObject();
		newBody.put("name", "Vighnesh");
		newBody.put("job", "Trainee");
		
		
		
		//now we can create the request
		given()
		.body(newBody.toJSONString())
		.when()
		.post("https://reqres.in/api/users")
		.then()
		.statusCode(201);
		
	}
}
