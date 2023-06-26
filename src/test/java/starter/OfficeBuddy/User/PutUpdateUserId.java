package starter.OfficeBuddy.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class PutUpdateUserId {
    protected String url = "https://api.officebuddy.space/api/v1";

    @Step("I Set PUT Api endpoints")
    public String setPUTApiEndpoints(){
        return url + "/user/edit/262";
    }
    @Step("I Send PUT HTTP request")
    public void sendPUTHttpRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("company","capstone13");
        requestBody.put("dateBirthInput","2023-02-18");
        requestBody.put("email","capstone13@gmail.com");
        requestBody.put("gender","other");
        requestBody.put("name","capstone13");
        requestBody.put("password","capstone13");
        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluMkBnbWFpbC5jb20iLCJpZCI6MTQsImlzX3ZlcmlmeSI6ZmFsc2UsInJvbGUiOjF9.h5TqQpccRSwoZkK8ul407I0IZKqHgsrs4q8kTmhDxys")
                .header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPUTApiEndpoints());
    }
    @Step("I Receive Valid HTTP response 200")
    public void reciveHTTPResponseCode20O(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
