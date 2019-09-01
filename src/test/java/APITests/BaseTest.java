package APITests;

import apiLayers.APIFactory;
import apiLayers.Countries;

public class BaseTest extends APIFactory {

    Countries countries;

    BaseTest() {
        countries = new Countries();
    }
}
