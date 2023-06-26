package starter.OfficeBuddy.midtrans;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class MidTransactions {
    protected static String url = "https://api.officebuddy.space/api/v1/";

    @Step("I set GET endpoints detail payment")
    public String GetApiEndpointDetailPayment(){
        return url + "transaction/414/payment-detail";
    }
    @Step("I set GET endpoints detail payment using invalid id")
    public String iSetGETEndpointsDetailPaymentUsingInvalidId(){ return url + "transaction/*90&7/payment-detail";
    }
    @Step("I send GET HTTP request detail payment")
    public void GetHttpRequestDetailPayment(){
        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluMUBnbWFpbC5jb20iLCJpZCI6MTMsImlzX3ZlcmlmeSI6ZmFsc2UsInJvbGUiOjF9.CVDdRQKKNo6YJsrBH3s90xj09e6-vGB9lSBld4bCWE0")
                .get(GetApiEndpointDetailPayment());
    }
    @Step("I send GET HTTP request with input invalid token for detail payment")
    public void iSendGETHTTPRequestWithInputInvalidTokenForDetailPayment(){
        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluMUBnbWFpbC5jb20iLCJpZCI6MTMsImlzX3ZlcmlmeSI6ZmFsc2UsInJvbGUiOjF9.CVDdRQKKNo6YJsrBH3s90xj09e6-vGB9lSBld4bCWE0ii097")
                .get(GetApiEndpointDetailPayment());
    }
    @Step("I send POST HTTP request to invalid endpoints detail payment")
    public void iSendPOSTHTTPRequestToInvalidEndpointsDetailPayment(){
        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluMUBnbWFpbC5jb20iLCJpZCI6MTMsImlzX3ZlcmlmeSI6ZmFsc2UsInJvbGUiOjF9.CVDdRQKKNo6YJsrBH3s90xj09e6-vGB9lSBld4bCWE0ii")
                .post(GetApiEndpointDetailPayment());
    }
    @Step("I receive valid HTTP response code 200 for get id detail payment")
    public void validateHttpResponseCode200ForGetIdDetailPayment(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid HTTP response code {int} for detail payment")
    public void iReceiveValidHTTPResponseCodeForDetailPayment(){
        restAssuredThat(response -> response.statusCode(404));
    }
    @Step("I receive valid HTTP response code {int} to detail payment")
    public void iReceiveValidHTTPResponseCodeToDetailPayment(){
        restAssuredThat(response -> response.statusCode(401));
    }
    @Step("I receive valid data for id detail payment")
    public void validateDataForIdDetailPayment(){

    }
}
