package apiLayers;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import routes.APIRoutes;
import utilities.Utility;

import static io.restassured.RestAssured.given;

public class APIFactory {

    APIRoutes apiRoutes;
    private Utility utility;


    protected APIFactory() {

        apiRoutes = new APIRoutes();
        utility = new Utility();
    }

    Response makeGetCallAndReturnResponse(String URI) {

        RestAssured.baseURI = URI;
        Response response = given()
                .when()
                .get();

        return response;
//        return response.prettyPrint();
    }
}
