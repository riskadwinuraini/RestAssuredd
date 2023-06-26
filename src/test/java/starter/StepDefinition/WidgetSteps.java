package starter.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.OfficeBuddy.Widget.GetDashboardWidget;
import starter.OfficeBuddy.Widget.GetOfficeWidget;
import starter.OfficeBuddy.Widget.GetRevenueWidget;
import starter.OfficeBuddy.Widget.GetUserWidget;


public class WidgetSteps {
    @Steps
    GetDashboardWidget getDashboardWidget;
    @Steps
    GetOfficeWidget getOfficeWidget;
    @Steps
    GetRevenueWidget getRevenueWidget;
    @Steps
    GetUserWidget getUserWidget;

    @Given("I set GET endpoints dashboard widget")
    public void GetApiEndpointDashboardWidget(){ getDashboardWidget.GetApiEndpointDashboardWidget();
    }
    @Given("I set GET endpoints office widget")
    public void iSetGETEndpointsOfficeWidget() { getOfficeWidget.iSetGETEndpointsOfficeWidget();

    }
    @Given("I set GET endpoints revenue widget")
    public void iSetGETEndpointsRevenueWidget() { getRevenueWidget.iSetGETEndpointsRevenueWidget();

    }
    @Given("I set GET endpoints user widget")
    public void iSetGETEndpointsUserWidget() {  getUserWidget.iSetGETEndpointsUserWidget();

    }
    @When("I send GET HTTP request for dashboard widget")
    public void GetHttpRequestForDashboardWidget(){ getDashboardWidget.GetHttpRequestForDashboardWidget();
    }
    @When("I send GET HTTP request with input invalid token for dashboard widget")
    public void iSendGETHTTPRequestWithInputInvalidTokenForDashboardWidget() { getDashboardWidget.iSendGETHTTPRequestWithInputInvalidTokenForDashboardWidget();
    }
    @When("I send GET HTTP request with invalid endpoints for dashboard widget")
    public void iSendGETHTTPRequestWithInvalidEndpointsForDashboardWidget() { getDashboardWidget.iSendGETHTTPRequestWithInvalidEndpointsForDashboardWidget();
    }
    @When("I send GET HTTP request for office widget")
    public void iSendGETHTTPRequestForOfficeWidget() { getOfficeWidget.iSendGETHTTPRequestForOfficeWidget();

    }
    @When("I send GET HTTP request with input invalid token for office widget")
    public void iSendGETHTTPRequestWithInputInvalidTokenForOfficeWidget() { getOfficeWidget.iSendGETHTTPRequestWithInputInvalidTokenForOfficeWidget();

    }

    @When("I send GET HTTP request with input invalid endpoints for office widget")
    public void iSendGETHTTPRequestWithInputInvalidEndpointsForOfficeWidget() { getOfficeWidget.iSendGETHTTPRequestWithInputInvalidEndpointsForOfficeWidget();
    }
    @When("I send GET HTTP request code for get revenue widget")
    public void iSendGETHTTPRequestCodeForGetRevenueWidget() { getRevenueWidget.iSendGETHTTPRequestCodeForGetRevenueWidget();

    }
    @When("I send GET HTTP request with invalid token for revenue widget")
    public void iSendGETHTTPRequestWithInvalidTokenForRevenueWidget() { getRevenueWidget.iSendGETHTTPRequestWithInvalidTokenForRevenueWidget();
    }
    @When("I send GET HTTP request with input invalid endpoints for revenue widget")
    public void iSendGETHTTPRequestWithInputInvalidEndpointsForRevenueWidget() { getRevenueWidget.iSendGETHTTPRequestWithInputInvalidEndpointsForRevenueWidget();
    }
    @When("I send GET HTTP request for user widget")
    public void iSendGETHTTPRequestForUserWidget() { getUserWidget.iSendGETHTTPRequestForUserWidget();

    }
    @When("I send GET HTTP request with input invalid token for user widget")
    public void iSendGETHTTPRequestWithInputInvalidTokenForUserWidget() { getUserWidget.iSendGETHTTPRequestWithInputInvalidTokenForUserWidget();

    }

    @When("I send GET HTTP request with input invalid endpoints for user widget")
    public void iSendGETHTTPRequestWithInputInvalidEndpointsForUserWidget() { getUserWidget.iSendGETHTTPRequestWithInputInvalidEndpointsForUserWidget();

    }
    @Then("I receive valid HTTP response code 200 for get dashboard widget")
    public void validateHttpResponseCode200ForGetDashboardWidget(){ getDashboardWidget.validateHttpResponseCode200ForGetDashboardWidget();
    }
    @Then("I receive valid HTTP response code {int} for dashboard widget")
    public void iReceiveValidHTTPResponseCodeForDashboardWidget(int arg0) { getDashboardWidget.iReceiveValidHTTPResponseCodeForDashboardWidget(401);
    }
    @Then("I receive valid HTTP response code {int} dashboard widget")
    public void iReceiveValidHTTPResponseCodeDashboardWidget(int arg0) { getDashboardWidget.iReceiveValidHTTPResponseCodeDashboardWidget(404);
    }
    @Then("I receive valid HTTP response code {int} for get office widget")
    public void iReceiveValidHTTPResponseCodeForGetOfficeWidget(int arg0) { getOfficeWidget.iReceiveValidHTTPResponseCodeForGetOfficeWidget(200);

    }
    @Then("I receive valid HTTP response code {int} for office widget")
    public void iReceiveValidHTTPResponseCodeForOfficeWidget(int arg0) { getOfficeWidget.iReceiveValidHTTPResponseCodeForOfficeWidget(401);
    }

    @Then("I receive valid HTTP response code {int} office widget")
    public void iReceiveValidHTTPResponseCodeOfficeWidget(int arg0) { getOfficeWidget.iReceiveValidHTTPResponseCodeOfficeWidget(404);
    }
    @Then("I receive valid HTTP response code {int} for get revenue widget")
    public void iReceiveValidHTTPResponseCodeForGetRevenueWidget(int arg0) { getRevenueWidget.iReceiveValidHTTPResponseCodeForGetRevenueWidget(200);

    }
    @Then("I receive valid HTTP response code {int} for revenue widget")
    public void iReceiveValidHTTPResponseCodeForRevenueWidget(int arg0) { getRevenueWidget.iReceiveValidHTTPResponseCodeForRevenueWidget(401);
    }
    @Then("I receive valid HTTP response code {int} revenue widget")
    public void iReceiveValidHTTPResponseCodeRevenueWidget(int arg0) { getRevenueWidget.iReceiveValidHTTPResponseCodeRevenueWidget(404);
    }
    @Then("I receive valid HTTP response code {int} for get user widget")
    public void iReceiveValidHTTPResponseCodeForGetUserWidget(int arg0) { getUserWidget.iReceiveValidHTTPResponseCodeForGetUserWidget(200);

    }

    @Then("I receive valid HTTP response code {int} for user widget")
    public void iReceiveValidHTTPResponseCodeForUserWidget(int arg0) { getUserWidget.iReceiveValidHTTPResponseCodeForUserWidget(401);
    }

    @Then("I receive valid HTTP response code {int} user widget")
    public void iReceiveValidHTTPResponseCodeUserWidget(int arg0) { getUserWidget.iReceiveValidHTTPResponseCodeUserWidget(404);

    }

    @And("I receive valid data for dashboard widget")
    public void validateDataDetailOfficeForDashboardWidget(){ getDashboardWidget.validateDataDetailOfficeForDashboardWidget();
    }
    @And("I receive valid data for office widget")
    public void iReceiveValidDataForOfficeWidget() { getOfficeWidget.iReceiveValidDataForOfficeWidget();
    }
    @And("I receive valid data for revenue widget")
    public void iReceiveValidDataForRevenueWidget() { getRevenueWidget.iReceiveValidDataForRevenueWidget();
    }
    @And("I receive valid data for user widget")
    public void iReceiveValidDataForUserWidget() { getUserWidget.iReceiveValidDataForUserWidget();

    }


}
