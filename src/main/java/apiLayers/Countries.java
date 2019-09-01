package apiLayers;

import io.restassured.response.Response;

public class Countries extends APIFactory {

    public Response getAllCountries() {

       return makeGetCallAndReturnResponse(apiRoutes.getAllCountries());

    }
}
