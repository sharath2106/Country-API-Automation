package APITests;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class CountryTest extends BaseTest {

    @Test
    public void testGetAllCountries() {
        Response allCountries = countries.getAllCountries();

        JsonPath jsonPath = allCountries.jsonPath();
        ArrayList<String> city = jsonPath.get("countryName"); //TODO

        allCountries.then().assertThat().statusCode(200);

    }

    @Test
    public void testCountry() {
        Response getCountryResponse = countries.getCountry("IND");

        JsonPath jsonPath = getCountryResponse.jsonPath();
        String city = jsonPath.get("countryName");

        Assert.assertEquals("India", city); //TODO
        getCountryResponse.then().assertThat().statusCode(200);

    }

    @Test
    public void testInvalidCountry() {
        Response getCountryResponse = countries.getCountry("ITA");

        getCountryResponse.then().assertThat().statusCode(404);

    }

    @Test
    public void addNewCountry() {
        Response getCountryResponse = countries.addNewCountry();

        System.out.println(getCountryResponse);
        getCountryResponse.then().assertThat().statusCode(404);

    }
}
