package starter.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.OfficeBuddy.midtrans.MidTransactions;

public class MidTransactionSteps {
    @Steps
    MidTransactions midTransactions;
    @Given("I set GET endpoints detail payment")
    public void GetApiEndpointDetailPayment() { midTransactions.GetApiEndpointDetailPayment();
    }
    @Given("I set GET endpoints detail payment using invalid id")
    public void iSetGETEndpointsDetailPaymentUsingInvalidId() { midTransactions.iSetGETEndpointsDetailPaymentUsingInvalidId();
    }

    @When("I send GET HTTP request detail payment")
    public void GetHttpRequestDetailPayment(){ midTransactions.GetHttpRequestDetailPayment();
    }
    @When("I send GET HTTP request with input invalid token for detail payment")
    public void iSendGETHTTPRequestWithInputInvalidTokenForDetailPayment() { midTransactions.iSendGETHTTPRequestWithInputInvalidTokenForDetailPayment();
    }
    @When("I send POST HTTP request to invalid endpoints detail payment")
    public void iSendPOSTHTTPRequestToInvalidEndpointsDetailPayment() { midTransactions.iSendPOSTHTTPRequestToInvalidEndpointsDetailPayment();
    }
    @Then("I receive valid HTTP response code 200 for get id detail payment")
    public void validateHttpResponseCode200ForGetIdDetailPayment(){ midTransactions.validateHttpResponseCode200ForGetIdDetailPayment();
    }
    @Then("I receive valid HTTP response code {int} for detail payment")
    public void iReceiveValidHTTPResponseCodeForDetailPayment(int arg0) { midTransactions.iReceiveValidHTTPResponseCodeForDetailPayment();
    }

    @Then("I receive valid HTTP response code {int} to detail payment")
    public void iReceiveValidHTTPResponseCodeToDetailPayment(int arg0) { midTransactions.iReceiveValidHTTPResponseCodeToDetailPayment();
    }
    @And("I receive valid data for id detail payment")
    public void validateDataForIdDetailPayment(){ midTransactions.validateDataForIdDetailPayment();
    }



}
