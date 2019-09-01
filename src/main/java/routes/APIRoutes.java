package routes;

import utilities.Utility;

public class APIRoutes {

    private Utility utility = new Utility();
    private String baseURL = utility.getPropertyValue("API_URI");
    private String allCountries;

    public APIRoutes() {
        setAllCountries();
    }

    public String getAllCountries() {
        return allCountries;
    }

    public void setAllCountries() {
        this.allCountries = baseURL + "/get/all";
    }
}
