package starter.OfficeBuddy.Widget;


import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;


public class GetUserWidget {
    protected static String url = "https://api.officebuddy.space/api/v1/";

    @Step("I set GET endpoints user widget")
    public String iSetGETEndpointsUserWidget() { return url + "admin/user-widget";

    }


    @Step("I send GET HTTP request for user widget")
    public void iSendGETHTTPRequestForUserWidget() {
        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluMUBnbWFpbC5jb20iLCJpZCI6MTMsImlzX3ZlcmlmeSI6ZmFsc2UsInJvbGUiOjF9.CVDdRQKKNo6YJsrBH3s90xj09e6-vGB9lSBld4bCWE0")
                .get(iSetGETEndpointsUserWidget());
    }
    @Step("I send GET HTTP request with input invalid token for user widget")
    public void iSendGETHTTPRequestWithInputInvalidTokenForUserWidget() {
        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluMUBnbWFpbC5jb20iLCJpZCI6MTMsImlzX3ZlcmlmeSI6ZmFsc2UsInJvbGUiOjF9.CVDdRQKKNo6YJsrBH3s90xj09e6-vGB9lSBld4bCWE0ii754")
                .get(iSetGETEndpointsUserWidget());
    }

    @Step("I send GET HTTP request with input invalid endpoints for user widget")
    public void iSendGETHTTPRequestWithInputInvalidEndpointsForUserWidget() {
        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluMUBnbWFpbC5jb20iLCJpZCI6MTMsImlzX3ZlcmlmeSI6ZmFsc2UsInJvbGUiOjF9.CVDdRQKKNo6YJsrBH3s90xj09e6-vGB9lSBld4bCWE0")
                .post(iSetGETEndpointsUserWidget());
    }

    @Step("I receive valid HTTP response code {int} for get user widget")
    public void iReceiveValidHTTPResponseCodeForGetUserWidget(int arg0) {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid HTTP response code {int} for user widget")
    public void iReceiveValidHTTPResponseCodeForUserWidget(int arg0) {
        restAssuredThat(response -> response.statusCode(401));
    }

    @Step("I receive valid HTTP response code {int} user widget")
    public void iReceiveValidHTTPResponseCodeUserWidget(int arg0) {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I receive valid data for user widget")
    public void iReceiveValidDataForUserWidget() {
    }
}
