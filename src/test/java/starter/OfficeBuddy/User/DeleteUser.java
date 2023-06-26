package starter.OfficeBuddy.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteUser {
    protected String url = "https://api.officebuddy.space/api/v1";

    @Step("I Set Delete Api Endpoints")
    public String SetDeleteApiEndpoints(){
        return url + "/user/280";
    }
    @Step("I Send Delete HTTP Request")
    public void SendDeleteApiEndpoints(){
        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluMkBnbWFpbC5jb20iLCJpZCI6MTQsImlzX3ZlcmlmeSI6ZmFsc2UsInJvbGUiOjF9.h5TqQpccRSwoZkK8ul407I0IZKqHgsrs4q8kTmhDxys")
                .when()
                .delete(SetDeleteApiEndpoints());
    }
    @Step("I Receive Valid HTTP Response Code 200")
    public void ValidateHttpResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
