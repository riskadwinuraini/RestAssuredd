package starter.OfficeBuddy.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetProfileInvalidToken {
    protected static String url = "https://api.officebuddy.space/api/v1";

    @Step("I set GET Endpoints")
    public String SetGETEndpoints(){
        return url + "/user/me";
    }
    @Step("I send GET HTTP Request")
    public void SendGEThttpRequest(){
        SerenityRest.given().header("Authorization","Bearer abc-acb-llp-213-abc")
                .when()
                .get(SetGETEndpoints());
    }
    @Step("I receive Valid HTTP Response Code 401")
    public void HTTPResponse401(){
        restAssuredThat(response -> response.statusCode(401));
    }



}
