package starter.OfficeBuddy.Widget;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetOfficeWidget {
    protected static String url = "https://api.officebuddy.space/api/v1/";

    @Step("I set GET endpoints office widget")
    public String iSetGETEndpointsOfficeWidget() { return url + "admin/office-widget?type=office";
    }

    @Step("I send GET HTTP request for office widget")
    public void iSendGETHTTPRequestForOfficeWidget() {
        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluMUBnbWFpbC5jb20iLCJpZCI6MTMsImlzX3ZlcmlmeSI6ZmFsc2UsInJvbGUiOjF9.CVDdRQKKNo6YJsrBH3s90xj09e6-vGB9lSBld4bCWE0")
                .get(iSetGETEndpointsOfficeWidget());

    }
    @Step("I send GET HTTP request with input invalid token for office widget")
    public void iSendGETHTTPRequestWithInputInvalidTokenForOfficeWidget() {
        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluMUBnbWFpbC5jb20iLCJpZCI6MTMsImlzX3ZlcmlmeSI6ZmFsc2UsInJvbGUiOjF9.CVDdRQKKNo6YJsrBH3s90xj09e6-vGB9lSBld4bCWE0ii")
                .get(iSetGETEndpointsOfficeWidget());
    }

    @Step("I send GET HTTP request with input invalid endpoints for office widget")
    public void iSendGETHTTPRequestWithInputInvalidEndpointsForOfficeWidget() {
        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluMUBnbWFpbC5jb20iLCJpZCI6MTMsImlzX3ZlcmlmeSI6ZmFsc2UsInJvbGUiOjF9.CVDdRQKKNo6YJsrBH3s90xj09e6-vGB9lSBld4bCWE0")
                .post(iSetGETEndpointsOfficeWidget());
    }

    @Step("I receive valid HTTP response code {int} for get office widget")
    public void iReceiveValidHTTPResponseCodeForGetOfficeWidget(int arg0) {
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid HTTP response code {int} for office widget")
    public void iReceiveValidHTTPResponseCodeForOfficeWidget(int arg0) {
        restAssuredThat(response -> response.statusCode(401));
    }

    @Step("I receive valid HTTP response code {int} office widget")
    public void iReceiveValidHTTPResponseCodeOfficeWidget(int arg0) {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I receive valid data for office widget")
    public void iReceiveValidDataForOfficeWidget() {
    }
}
