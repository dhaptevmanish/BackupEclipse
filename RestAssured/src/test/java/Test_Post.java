import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Test_Post {

	@Test 
	
	public void Test_Post() {
		
//		Map <String, Object> map = new HashMap <String, Object> ();
//		
//		map.put("name", "raghav");
//		map.put("job", "fucker");
//		
//		System.out.println(map);
		
		JSONObject request = new JSONObject(); // this converts the structure into a readable JSON format
		
		request.put("name", "Raghav");
		request.put("job", "Teacher");

		
		System.out.println(request.toJSONString()); // this will cnvrt the request to JSON format
		// we always have to give a header while sending out an post request
		given().header("Content-Type", "application/json")
		// here we are saying that we need to accept only the content with type as JSON 
		.contentType(ContentType.JSON).accept(ContentType.JSON).
		
		
		body(request.toJSONString()).
		when().put("https://reqres.in/api/users/2").then().statusCode(200).log().all();
		
		// for create post req the status code will be 201 
		

		
	}
	
}
