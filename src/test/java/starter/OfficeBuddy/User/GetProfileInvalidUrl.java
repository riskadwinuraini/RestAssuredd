package starter.OfficeBuddy.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetProfileInvalidUrl {
    protected static String url = "https://api.officebuddy.space/api/v1";

    @Step("I invalid set get endpoints")
    public String setGETEndpoints(){
        return url + "/user/my";
    }
    @Step("I send GET HTTP request")
    public void SendGETHttpRequest(){
        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImNhcHN0b25lQGdtYWlsLmNvbSIsImlkIjoyNjUsImlzX3ZlcmlmeSI6ZmFsc2UsInJvbGUiOjB9.H4hoh8Dcv7U4Au3lw3n6pVPAdLCLvzZcfoAg5iaKOHM")
                .when()
                .get(setGETEndpoints());
    }
    @Step("I receive Valid HTTP response Code 404")
    public void HTTPResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }



}
