package starter.OfficeBuddy.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class PutUpdateUserIdInvalidDate {
    protected String url = "https://api.officebuddy.space/api/v1";

    @Step("I set PUT Api endpoints")
    public String setPutApiEndpoint(){
        return url + "/user/edit/262";
    }
    @Step("I send PUT HTTP request")
    public void sendPutHttpRequests(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("company","capstone13");
        requestBody.put("dateBirthInput","20:23");
        requestBody.put("email","capstone13@gmail.com");
        requestBody.put("gender","other");
        requestBody.put("name","capstone13");
        requestBody.put("password","capstone13");
        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluMkBnbWFpbC5jb20iLCJpZCI6MTQsImlzX3ZlcmlmeSI6ZmFsc2UsInJvbGUiOjF9.h5TqQpccRSwoZkK8ul407I0IZKqHgsrs4q8kTmhDxys")
                .header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPutApiEndpoint());
    }
    @Step("I receive Valid HTTP response 500")
    public void reciveHTTPResponses50O(){
        restAssuredThat(response -> response.statusCode(500));
    }
}
