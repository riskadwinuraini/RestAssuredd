package starter.OfficeBuddy.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteUserInvalidToken {
    protected String url = "https://api.officebuddy.space/api/v1";

    @Step("I set Delete Api Endpoints")
    public String setDeleteApiEndpoints(){
        return url + "/user/13";
    }
    @Step("I send Delete HTTP Request")
    public void sendDeleteApiEndpoints(){
        SerenityRest.given().header("Authorization","Bearer abg-ppo-454-gfg")
                .when()
                .delete(setDeleteApiEndpoints());
    }
    @Step("I receive Valid HTTP response Code 401")
    public void HttpResponseCode401(){
        restAssuredThat(response -> response.statusCode(401));
    }
}
