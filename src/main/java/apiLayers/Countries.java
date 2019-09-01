package apiLayers;

import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class Countries extends APIFactory {

    public Response getAllCountries() {

       return makeGetCallAndReturnResponse(apiRoutes.getAllCountries());

    }

    public Response getCountry(String countryName) {

        return makeGetCallWithParametersAndReturnResponse(apiRoutes.getSingleCountry(), countryName);

    }

    public Response addNewCountry() {

        JSONObject requestBody = new JSONObject();
        requestBody.put("countryName", "IT");
        requestBody.put("alpha2code", "IT");
        requestBody.put("alpha3code", "IT");
        return makePostCallAndReturnResponse(apiRoutes.getAddCountry(), requestBody);

    }
}
