package Weather;

import java.util.Map;

import org.testng.annotations.Test;

public class GetWeather 
{
	@Test
	public void getWeather() {
		

		//Method for hitting Get Request for some REQUEST PAYLOAD
		public static RequestSpecification request(String environment, Object requestPayload, Map<String,String> header) {
			return RestAssured.given().log().all()
					.baseUri(prop.getProperty("baseUrl"))
					.headers(header)
					.contentType(ContentType.JSON)
					.body(requestPayload);
		}

}
