package starter.OfficeBuddy.Office;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CreateOffice {
    protected static String url = "https://api.officebuddy.space/api/v1/";

    @Step("I set POST endpoints")
    public String iSetPOSTEndpoints() {return url + "office?type=office";}

    @Step("I send POST HTTP request")
    public void iSendPOSTHTTPRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("capacity",10);
        requestBody.put("close","15:00:05");
        requestBody.put("description","hello world!!");
        requestBody.put("facilities","test");
        requestBody.put("location","korea");
        requestBody.put("name","nur");
        requestBody.put("open","09:04:05");
        requestBody.put("price",3000);

        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluMUBnbWFpbC5jb20iLCJpZCI6MTMsImlzX3ZlcmlmeSI6ZmFsc2UsInJvbGUiOjF9.CVDdRQKKNo6YJsrBH3s90xj09e6-vGB9lSBld4bCWE0")
                .header("Content-Type", "application/json").body(requestBody.toJSONString()).post(iSetPOSTEndpoints());
    }
    @Step("I send POST HTTP request with input invalid data for create")
    public void iSendPOSTHTTPRequestWithInputInvalidDataForCreate(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("capacity",5);
        requestBody.put("close","senin");
        requestBody.put("description","hello world!!");
        requestBody.put("facilities","test");
        requestBody.put("location","korea");
        requestBody.put("name","nur");
        requestBody.put("open","selasa");
        requestBody.put("price",3000);

        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluMUBnbWFpbC5jb20iLCJpZCI6MTMsImlzX3ZlcmlmeSI6ZmFsc2UsInJvbGUiOjF9.CVDdRQKKNo6YJsrBH3s90xj09e6-vGB9lSBld4bCWE0")
                .header("Content-Type", "application/json").body(requestBody.toJSONString()).post(iSetPOSTEndpoints());
    }
    @Step("I send PUT HTTP request to invalid endpoints for create")
    public void iSendPUTHTTPRequestToInvalidEndpointsForCreate(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("capacity",10);
        requestBody.put("close","15:00:05");
        requestBody.put("description","hello world!!");
        requestBody.put("facilities","test");
        requestBody.put("location","korea");
        requestBody.put("name","nur");
        requestBody.put("open","09:04:05");
        requestBody.put("price",3000);

        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluMUBnbWFpbC5jb20iLCJpZCI6MTMsImlzX3ZlcmlmeSI6ZmFsc2UsInJvbGUiOjF9.CVDdRQKKNo6YJsrBH3s90xj09e6-vGB9lSBld4bCWE0")
                .header("Content-Type", "application/json").body(requestBody.toJSONString()).put(iSetPOSTEndpoints());
    }
    @Step("I send POST HTTP request with input invalid token for create")
    public void iSendPOSTHTTPRequestWithInputInvalidTokenForCreate(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("capacity",10);
        requestBody.put("close","15:00:05");
        requestBody.put("description","hello world!!");
        requestBody.put("facilities","test");
        requestBody.put("location","korea");
        requestBody.put("name","nur");
        requestBody.put("open","09:04:05");
        requestBody.put("price",3000);

        SerenityRest.given().header("Authorization","Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluMUBnbWFpbC5jb20iLCJpZCI6MTMsImlzX3ZlcmlmeSI6ZmFsc2UsInJvbGUiOjF9.CVDdRQKKNo6YJsrBH3s90xj09e6-vGB9lSBld4bCWE0iii")
                .header("Content-Type", "application/json").body(requestBody.toJSONString()).post(iSetPOSTEndpoints());
    }

    @Step("I receive valid HTTP response code {int} for create office")
    public void iReceiveValidHTTPResponseCodeForCreateOffice(int arg0) {
        restAssuredThat(response -> response.statusCode(201));
    }

    @Step("I receive valid data for create office")
    public void iReceiveValidDataForCreateOffice() {
        restAssuredThat(response -> response.statusCode(201));
    }
    @Step("I receive valid HTTP response code {int} for invalid data to create")
    public void iReceiveValidHTTPResponseCodeForInvalidDataToCreate(){
        restAssuredThat(response -> response.statusCode(500));
    }
    @Step("I receive valid HTTP response code {int} for invalid endpoints to create office")
    public void iReceiveValidHTTPResponseCodeForInvalidEndpointsToCreateOffice(){
        restAssuredThat(response -> response.statusCode(404));
    }
    @Step("I receive valid HTTP response code {int} to create")
    public void iReceiveValidHTTPResponseCodeToCreate(){
        restAssuredThat(response -> response.statusCode(401));
    }
}
