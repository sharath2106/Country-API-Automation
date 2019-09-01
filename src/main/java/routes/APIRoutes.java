package routes;

import utilities.Utility;

public class APIRoutes {

    private Utility utility = new Utility();
    private String baseURL = utility.getPropertyValue("API_URI");
    private String allCountries;
    private String singleCountry;

    public APIRoutes() {
        setAllCountries();
        setSingleCountry();
    }

    public String getAllCountries() {
        return allCountries;
    }

    public void setAllCountries() {
        this.allCountries = baseURL + "/get/all";
    }

    public String getSingleCountry() {
        return singleCountry;
    }

    public void setSingleCountry() {
        this.singleCountry = baseURL + "/get/iso2code/";
    }
}
