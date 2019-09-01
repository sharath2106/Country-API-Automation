package routes;

import lombok.Getter;
import utilities.Utility;

@Getter
public class APIRoutes {

    private Utility utility = new Utility();
    private String baseURL = utility.getPropertyValue("API_URI");
    private String allCountries;
    private String singleCountry;
    private String addCountry;

    public APIRoutes() {
        setAllCountries();
        setSingleCountry();
        setAddCountry();
    }

    private void setAllCountries() {
        this.allCountries = baseURL + "/get/all";
    }

    private void setSingleCountry() {
        this.singleCountry = baseURL + "/get/iso2code/";
    }

    private void setAddCountry() {
        this.addCountry = baseURL+"/add";
    }

}
