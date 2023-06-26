package starter.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.OfficeBuddy.User.*;

public class UserSteps {
    @Steps
    GetProfile getProfile;
    @Steps
    PutUpdateUser putUpdateUser;
    @Steps
    PutUpdateUserId putUpdateUserId;
    @Steps
    GetUserList getUserList;
    @Steps
    DeleteUser deleteUser;
    @Steps
    PutUpdateUserInvalidDate putUpdateUserWrongDate;
    @Steps
    PutUpdateUserIdInvalidDate putUpdateUserIdWrongDate;
    @Steps
    GetProfileInvalidToken getProfileInvalidToken;
    @Steps
    GetProfileInvalidUrl getProfileInvalidUrl;
    @Steps
    GetUserListInvalidToken getUserListInvalidToken;
    @Steps
    DeleteUserInvalidToken deleteUserInvalidToken;



    @Given("I Set GET Endpoints my profile")
    public void SetGETEndpointsMyProfile(){
        getProfile.SetGetEndpointsProfile();
    }
    @When("I Send GET HTTP Request my profile")
    public void SendGETHTTPRequestMyProfile(){
        getProfile.SendHttppRequestProfile();
    }
    @Then("I Receive HTTP Response Code 200 my profile")
    public void HTTPResponse200MyProfile(){
        getProfile.HTTPResponse200Profile();
    }


    @Given("I set GET Endpoints")
    public void SetGETEndpoints(){
        getProfileInvalidToken.SetGETEndpoints();
    }
    @When("I send GET HTTP Request")
    public void SendGEThttpRequest(){
        getProfileInvalidToken.SendGEThttpRequest();
    }
    @Then("I receive Valid HTTP Response Code 401")
    public void HTTPResponse401(){
        getProfileInvalidToken.HTTPResponse401();
    }


    @Given("I set GET endpoints")
    public void setGETEndpoints(){
        getProfileInvalidUrl.setGETEndpoints();
    }
    @When("I send GET HTTP request")
    public void SendGETHttpRequest(){
        getProfileInvalidUrl.SendGETHttpRequest();
    }
    @Then("I receive Valid HTTP response Code 404")
    public void HTTPResponseCode404(){
        getProfileInvalidUrl.HTTPResponseCode404();
    }


    @Given("I Set PUT Api Endpoints")
    public void SetPutApiEndpoints(){
        putUpdateUser.SetPutApiEndpoints();
    }
    @When("I Send PUT HTTP Request")
    public void SendPutHttpRequest(){
        putUpdateUser.SendPutHttpRequest();
    }
    @And("I Receive Valid HTTP Response 200")
    public void ReciveHTTPResponse20O(){
        putUpdateUser.ReciveHTTPResponse20O();
    }


    @Given("I set PUT Api Endpoints")
    public void setPutApiEndpoints(){
        putUpdateUserWrongDate.setPutApiEndpoints();
    }
    @When("I send PUT HTTP Request")
    public void sendPutHttpRequest(){
        putUpdateUserWrongDate.sendPutHttpRequest();
    }
    @And("I receive Valid HTTP Response 500")
    public void reciveHTTPResponse50O(){
        putUpdateUserWrongDate.reciveHTTPResponse50O();
    }


    @Given("I Set PUT Api endpoints")
    public void setPUTApiEndpoints(){
        putUpdateUserId.setPUTApiEndpoints();
    }
    @When("I Send PUT HTTP request")
    public void sendPUTHttpRequest(){
        putUpdateUserId.sendPUTHttpRequest();
    }
    @And("I Receive Valid HTTP response 200")
    public void reciveHTTPResponseCode20O(){
        putUpdateUserId.reciveHTTPResponseCode20O();
    }


    @Given("I set PUT Api endpoints")
    public void setPutApiEndpoint(){
        putUpdateUserIdWrongDate.setPutApiEndpoint();
    }
    @When("I send PUT HTTP request")
    public void sendPutHttpRequests(){
        putUpdateUserIdWrongDate.sendPutHttpRequests();
    }
    @And("I receive Valid HTTP response 500")
    public void reciveHTTPResponses50O(){
        putUpdateUserIdWrongDate.reciveHTTPResponses50O();
    }


    @Given("I Set GET endpoints")
    public void SetGetEndpointS(){
        getUserList.SetGetEndpointS();
    }
    @When("I Send GET HTTP request")
    public void SendHttppRequesT(){
        getUserList.SendHttppRequesT();
    }
    @Then("I Receive Valid HTTP Response Code 201")
    public void HTTPResponse201(){
        getUserList.HTTPResponse201();
    }


    @Given("I set get endpoints")
    public void setgetEndpoints(){
        getUserListInvalidToken.setgetEndpoints();
    }
    @When("I send get http request")
    public void sendhttppRequest(){
        getUserListInvalidToken.sendhttppRequest();
    }
    @Then("I receive valid http response code 401")
    public void Httpresponse401(){
        getUserListInvalidToken.Httpresponse401();
    }



    @Given("I Set Delete Api Endpoints")
    public void SetDeleteApiEndpoints(){
        deleteUser.SetDeleteApiEndpoints();
    }
    @When("I Send Delete HTTP Request")
    public void SendDeleteApiEndpoints(){
        deleteUser.SendDeleteApiEndpoints();
    }
    @Then("I Receive Valid HTTP Response Code 200")
    public void ValidateHttpResponseCode200(){
        deleteUser.ValidateHttpResponseCode200();
    }


    @Given("I set Delete Api Endpoints")
    public void setDeleteApiEndpoints(){
        deleteUserInvalidToken.setDeleteApiEndpoints();
    }
    @When("I send Delete HTTP Request")
    public void sendDeleteApiEndpoints(){
        deleteUserInvalidToken.sendDeleteApiEndpoints();
    }
    @Then("I receive Valid HTTP response Code 401")
    public void HttpResponseCode401(){
        deleteUserInvalidToken.HttpResponseCode401();
    }



}
