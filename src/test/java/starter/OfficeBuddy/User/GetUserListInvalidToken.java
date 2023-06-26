package starter.OfficeBuddy.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetUserListInvalidToken {
    protected static String url = "https://api.officebuddy.space/api/v1";

    @Step("I set get endpoints")
    public String setgetEndpoints(){
        return url + "/user";
    }
    @Step("I send get http request")
    public void sendhttppRequest(){
        SerenityRest.given().header("Authorization","Bearer abn-bbc-ghj-111-e43-llo")
                .when()
                .get(setgetEndpoints());
    }
    @Step("I receive valid http response code 401")
    public void Httpresponse401(){
        restAssuredThat(response -> response.statusCode(401));
    }
}
