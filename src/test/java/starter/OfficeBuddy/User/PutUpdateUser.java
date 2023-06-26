package starter.OfficeBuddy.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class PutUpdateUser {
    protected String url = "https://api.officebuddy.space/api/v1";

    @Step("I Set PUT Api Endpoints")
    public String SetPutApiEndpoints(){
        return url + "/user/edit";
    }
    @Step("I Send PUT HTTP Request")
    public void SendPutHttpRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("company","QA13");
        requestBody.put("dateBirthInput","2023-02-18");
        requestBody.put("email","QA13@gmail.com");
        requestBody.put("gender","other");
        requestBody.put("name","QA13");
        requestBody.put("password","QA13");;
        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImNhcHN0b25lQGdtYWlsLmNvbSIsImlkIjoyNjUsImlzX3ZlcmlmeSI6ZmFsc2UsInJvbGUiOjB9.H4hoh8Dcv7U4Au3lw3n6pVPAdLCLvzZcfoAg5iaKOHM")
                .header("Content-Type", "application/json").body(requestBody.toJSONString()).put(SetPutApiEndpoints());
    }
    @Step("I Receive Valid HTTP Response 200")
    public void ReciveHTTPResponse20O(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
