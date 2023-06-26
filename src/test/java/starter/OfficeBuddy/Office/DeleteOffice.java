package starter.OfficeBuddy.Office;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteOffice {

    protected static String url = "https://api.officebuddy.space/api/v1/";
    @Step("I set DELETE endpoints")
    public String iSetDELETEEndpoints() { return url + "office/18";}

    @Step("I send DELETE HTTP request")
    public void iSendDELETEHTTPRequest() {
        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluMUBnbWFpbC5jb20iLCJpZCI6MTMsImlzX3ZlcmlmeSI6ZmFsc2UsInJvbGUiOjF9.CVDdRQKKNo6YJsrBH3s90xj09e6-vGB9lSBld4bCWE0")
                .get(iSetDELETEEndpoints());
    }

    @Step("I receive valid HTTP response code {int} in delete office")
    public void iReceiveValidHTTPResponseCodeInDeleteOffice(int arg0) {
        restAssuredThat(response -> response.statusCode(200));
    }
}
