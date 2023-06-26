package starter.OfficeBuddy.Widget;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetDashboardWidget {
    protected static String url = "https://api.officebuddy.space/api/v1/";

    @Step("I set GET endpoints dashboard widget")
    public String GetApiEndpointDashboardWidget(){
        return url + "admin/dashboard-widget";
    }
    @Step("I send GET HTTP request for dashboard widget")
    public void GetHttpRequestForDashboardWidget(){
        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluMUBnbWFpbC5jb20iLCJpZCI6MTMsImlzX3ZlcmlmeSI6ZmFsc2UsInJvbGUiOjF9.CVDdRQKKNo6YJsrBH3s90xj09e6-vGB9lSBld4bCWE0")
                .get(GetApiEndpointDashboardWidget());
    }
    @Step("I send GET HTTP request with input invalid token for dashboard widget")
    public void iSendGETHTTPRequestWithInputInvalidTokenForDashboardWidget() {
        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluMUBnbWFpbC5jb20iLCJpZCI6MTMsImlzX3ZlcmlmeSI6ZmFsc2UsInJvbGUiOjF9.CVDdRQKKNo6YJsrBH3s90xj09e6-vGB9lSBld4bCWE0ii67")
                .get(GetApiEndpointDashboardWidget());
    }
    @Step("I send GET HTTP request with invalid endpoints for dashboard widget")
    public void iSendGETHTTPRequestWithInvalidEndpointsForDashboardWidget() {
        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluMUBnbWFpbC5jb20iLCJpZCI6MTMsImlzX3ZlcmlmeSI6ZmFsc2UsInJvbGUiOjF9.CVDdRQKKNo6YJsrBH3s90xj09e6-vGB9lSBld4bCWE0")
                .post(GetApiEndpointDashboardWidget());
    }
    @Step("I receive valid HTTP response code 200 for get dashboard widget")
    public void validateHttpResponseCode200ForGetDashboardWidget(){

        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid HTTP response code {int} for dashboard widget")
    public void iReceiveValidHTTPResponseCodeForDashboardWidget(int arg0) {
        restAssuredThat(response -> response.statusCode(401));
    }
    @Step("I receive valid HTTP response code {int} dashboard widget")
    public void iReceiveValidHTTPResponseCodeDashboardWidget(int arg0) {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I receive valid data for dashboard widget")
    public void validateDataDetailOfficeForDashboardWidget(){

    }
}
