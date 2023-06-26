package starter.OfficeBuddy.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetUserList {
    protected static String url = "https://api.officebuddy.space/api/v1";

    @Step("I Set GET endpoints")
    public String SetGetEndpointS(){
        return url + "/user";
    }
    @Step("I Send GET HTTP request")
    public void SendHttppRequesT(){
        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluMkBnbWFpbC5jb20iLCJpZCI6MTQsImlzX3ZlcmlmeSI6ZmFsc2UsInJvbGUiOjF9.h5TqQpccRSwoZkK8ul407I0IZKqHgsrs4q8kTmhDxys")
                .when()
                .get(SetGetEndpointS());
    }
    @Step("I Receive Valid HTTP Response Code 201")
    public void HTTPResponse201(){
        restAssuredThat(response -> response.statusCode(201));
    }
}
