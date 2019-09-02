package APITests;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class CountryTest extends BaseTest {

    @Test
    public void testGetAllCountries() {
        Response responseForAllCountries = countries.getAllCountries();

        JsonPath jsonPathContainingCountries = responseForAllCountries.jsonPath();
        ArrayList<String> listOfAllCountries = jsonPathContainingCountries.get("countryName"); //TODO
        Assert.assertTrue(listOfAllCountries.size()>0);
        responseForAllCountries.then().assertThat().statusCode(HttpStatus.SC_OK);

    }

    @Test
    public void testCountry() {
        Response getCountryResponseToGetCountry = countries.getCountry("IND");

        JsonPath jsonPathContainingCountries = getCountryResponseToGetCountry.jsonPath();
        String countryName = jsonPathContainingCountries.get("countryName");

        Assert.assertEquals("India", countryName); //TODO
        getCountryResponseToGetCountry.then().assertThat().statusCode(HttpStatus.SC_OK);

    }

    @Test
    public void testInvalidCountry() {
        Response getCountryResponseForInvalidCountry = countries.getCountry("ITA");

        getCountryResponseForInvalidCountry.then().assertThat().statusCode(HttpStatus.SC_NOT_FOUND);

    }

    @Test
    public void addNewCountry() {
        Response getCountryResponseAfterAdding = countries.addNewCountry();

        getCountryResponseAfterAdding.then().assertThat().statusCode(HttpStatus.SC_OK);

    }
}
