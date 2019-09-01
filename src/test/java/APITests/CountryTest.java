package APITests;

import io.restassured.response.Response;
import org.testng.annotations.Test;

public class CountryTest extends BaseTest {

    @Test
    public void testGetAllCountries() {
        Response allCountries = countries.getAllCountries();

        allCountries.then().assertThat().statusCode(400);

    }
}
