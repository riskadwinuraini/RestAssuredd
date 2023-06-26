package starter.OfficeBuddy.Widget;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetRevenueWidget {

    protected static String url = "https://api.officebuddy.space/api/v1/";

    @Step("I set GET endpoints revenue widget")
    public String iSetGETEndpointsRevenueWidget() { return url + "admin/revenue-widget";

    }

    @Step("I send GET HTTP request code for get revenue widget")
    public void iSendGETHTTPRequestCodeForGetRevenueWidget() {
        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluMUBnbWFpbC5jb20iLCJpZCI6MTMsImlzX3ZlcmlmeSI6ZmFsc2UsInJvbGUiOjF9.CVDdRQKKNo6YJsrBH3s90xj09e6-vGB9lSBld4bCWE0")
                .get(iSetGETEndpointsRevenueWidget());
    }
    @Step("I send GET HTTP request with invalid token for revenue widget")
    public void iSendGETHTTPRequestWithInvalidTokenForRevenueWidget() {
        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluMUBnbWFpbC5jb20iLCJpZCI6MTMsImlzX3ZlcmlmeSI6ZmFsc2UsInJvbGUiOjF9.CVDdRQKKNo6YJsrBH3s90xj09e6-vGB9lSBld4bCWE0ii89")
                .get(iSetGETEndpointsRevenueWidget());

    }
    @Step("I send GET HTTP request with input invalid endpoints for revenue widget")
    public void iSendGETHTTPRequestWithInputInvalidEndpointsForRevenueWidget() {
        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluMUBnbWFpbC5jb20iLCJpZCI6MTMsImlzX3ZlcmlmeSI6ZmFsc2UsInJvbGUiOjF9.CVDdRQKKNo6YJsrBH3s90xj09e6-vGB9lSBld4bCWE0")
                .post(iSetGETEndpointsRevenueWidget());
    }

    @Step("I receive valid HTTP response code {int} for get revenue widget")
    public void iReceiveValidHTTPResponseCodeForGetRevenueWidget(int arg0) {
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid HTTP response code {int} for revenue widget")
    public void iReceiveValidHTTPResponseCodeForRevenueWidget(int arg0) {
        restAssuredThat(response -> response.statusCode(401));
    }
    @Step("I receive valid HTTP response code {int} revenue widget")
    public void iReceiveValidHTTPResponseCodeRevenueWidget(int arg0) {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I receive valid data for revenue widget")
    public void iReceiveValidDataForRevenueWidget() {
    }
}
