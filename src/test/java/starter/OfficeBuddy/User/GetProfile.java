package starter.OfficeBuddy.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetProfile {
    protected static String url = "https://api.officebuddy.space/api/v1";

    @Step("I Set GET Endpoints my profile")
    public String SetGetEndpointsProfile(){
        return url + "/user/me";
    }
    @Step("I Send GET HTTP Request my profile")
    public void SendHttppRequestProfile(){
        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImNhcHN0b25lQGdtYWlsLmNvbSIsImlkIjoyNjUsImlzX3ZlcmlmeSI6ZmFsc2UsInJvbGUiOjB9.H4hoh8Dcv7U4Au3lw3n6pVPAdLCLvzZcfoAg5iaKOHM")
                .when()
                .get(SetGetEndpointsProfile());
    }
    @Step("I Receive HTTP Response Code 200 my profile")
    public void HTTPResponse200Profile(){
        restAssuredThat(response -> response.statusCode(200));
    }



}
