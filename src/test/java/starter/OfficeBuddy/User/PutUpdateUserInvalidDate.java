package starter.OfficeBuddy.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class PutUpdateUserInvalidDate {
    protected String url = "https://api.officebuddy.space/api/v1";

    @Step("I set PUT Api Endpoints")
    public String setPutApiEndpoints(){
        return url + "/user/edit";
    }
    @Step("I send PUT HTTP Request")
    public void sendPutHttpRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name","QA13");
        requestBody.put("company","QA13");
        requestBody.put("dateBirthInput","02:18");
        requestBody.put("email","QA13@gmail.com");
        requestBody.put("gender","other");
        requestBody.put("password","QA13");;
        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImNhcHN0b25lQGdtYWlsLmNvbSIsImlkIjoyNjUsImlzX3ZlcmlmeSI6ZmFsc2UsInJvbGUiOjB9.H4hoh8Dcv7U4Au3lw3n6pVPAdLCLvzZcfoAg5iaKOHM")
                .header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPutApiEndpoints());
    }
    @Step("I receive Valid HTTP Response 500")
    public void reciveHTTPResponse50O(){
        restAssuredThat(response -> response.statusCode(500));
    }
}
