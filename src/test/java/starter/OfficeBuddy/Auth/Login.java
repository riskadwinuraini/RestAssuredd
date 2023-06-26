package starter.OfficeBuddy.Auth;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Login {
    protected static String url = "https://api.officebuddy.space/api/v1/";
    @Step("I have valid credentials")
    public String iHaveValidCredentials(){
        return url + "auth/login";
    }
    @Step("I submit a POST request to {string} with email {string} and password {string}")
    public void iSubmitAPOSTRequestToWithEmailAndPassword(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "testingg111@gmail.com");
        requestBody.put("password", "test123");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(iHaveValidCredentials());
    }
    @Step("I submit a POST request to {string} with incorrect email {string} and password {string}")
    public void iSubmitAPOSTRequestToWithIncorrectEmailAndPassword(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "t3st123*@#.com");
        requestBody.put("password", "testi123");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(iHaveValidCredentials());
    }
    @Step("I submit a POST request to {string} with email {string} and incorrect password {string}")
    public void iSubmitAPOSTRequestToWithEmailAndIncorrectPassword(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "testi123@gmail.com");
        requestBody.put("password", "testi1234");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(iHaveValidCredentials());
    }
    @Step("I submit a GET request to {string} with email {string} and incorrect password {string}")
    public void iSubmitAGETRequestToWithEmailAndIncorrectPassword(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "testingg111@gmail.com");
        requestBody.put("password", "test123");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).get(iHaveValidCredentials());
    }

    @Step("I receive valid HTTP response code Login {int}")
    public void iShouldGetAResponseCode(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid HTTP response code {int} for login")
    public void iReceiveValidHTTPResponseCodeForLogin(){
        restAssuredThat(response -> response.statusCode(500));
    }
    @Step("I receive valid HTTP response code {int} for invalid token")
    public void iReceiveValidHTTPResponseCodeForInvalidToken(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
