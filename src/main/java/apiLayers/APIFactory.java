package apiLayers;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import routes.APIRoutes;
import utilities.Utility;

import static io.restassured.RestAssured.given;

public class APIFactory {

    APIRoutes apiRoutes;


    protected APIFactory() {
        apiRoutes = new APIRoutes();
    }

    Response makeGetCallAndReturnResponse(String URI) {
        return RestAssured.given().when().get(URI);
    }

    Response makeGetCallWithParametersAndReturnResponse(String URI, String countryName) {
        return given().when().get(URI+"{countryName}", countryName);
    }

    Response makePostCallAndReturnResponse(String URI, JSONObject requestBody) {
        return RestAssured.given().when().header("Content-Type", "application/json").body(requestBody).post(URI);
    }
}
