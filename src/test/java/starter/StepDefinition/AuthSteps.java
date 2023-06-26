package starter.StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.OfficeBuddy.Auth.Login;

public class AuthSteps {
    @Steps
    Login login;
    @Given("I have valid credentials")
    public void iHaveValidCredentials() {
        login.iHaveValidCredentials();
    }

    @When("I submit a POST request to {string} with email {string} and password {string}")
    public void iSubmitAPOSTRequestToWithEmailAndPassword(String arg0, String arg1, String arg2) {
        login.iSubmitAPOSTRequestToWithEmailAndPassword();
    }

    @Then("I receive valid HTTP response code Login {int}")
    public void iReceiveValidHTTPResponseCodeLogin(int arg0) {
        login.iShouldGetAResponseCode();
    }

    @When("I submit a POST request to {string} with incorrect email {string} and password {string}")
    public void iSubmitAPOSTRequestToWithIncorrectEmailAndPassword(String arg0, String arg1, String arg2) {
        login.iSubmitAPOSTRequestToWithIncorrectEmailAndPassword();
    }
    @When("I submit a POST request to {string} with email {string} and incorrect password {string}")
    public void iSubmitAPOSTRequestToWithEmailAndIncorrectPassword(String arg0, String arg1, String arg2) {
        login.iSubmitAPOSTRequestToWithEmailAndIncorrectPassword();
    }
    @When("I submit a GET request to {string} with email {string} and incorrect password {string}")
    public void iSubmitAGETRequestToWithEmailAndIncorrectPassword(String arg0, String arg1, String arg2) {
        login.iSubmitAGETRequestToWithEmailAndIncorrectPassword();
    }
    @Then("I receive valid HTTP response code {int} for login")
    public void iReceiveValidHTTPResponseCodeForLogin(int arg0) {
        login.iReceiveValidHTTPResponseCodeForLogin();
    }

    @Then("I receive valid HTTP response code {int} for invalid token")
    public void iReceiveValidHTTPResponseCodeForInvalidToken(int arg0) {login.iReceiveValidHTTPResponseCodeForInvalidToken();

    }
}
