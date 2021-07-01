package steps;

import impl.SearchingImpl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SearchingSteps {
    @Given("I navigate to Google Flights")
    public void iNavigateToGoogleFlights() {
        SearchingImpl searchingImpl = new SearchingImpl();
        searchingImpl.navigateToGoogleFlights();

    }

    @Then("I should see Flights landing page")
    public void iShouldSeeFlightsLandingPage() {
        SearchingImpl searchingImpl = new SearchingImpl();
        searchingImpl.validateLandingPage();
    }

    @Then("I enter Washington DC in the departure field")
    public void iEnterWashingtonDCInTheDepartureField() {
        SearchingImpl searchingImpl = new SearchingImpl();
        searchingImpl.enterDCinDepartureField();
    }

    @Then("I enter Miami in the destination field")
    public void iEnterMiamiInTheDestinationField() {
        SearchingImpl searchingImpl = new SearchingImpl();
        searchingImpl.enterMiamiInDestinationField();
    }

    @Then("I select the departure date")
    public void iSelectTheDepartureDate() {
        SearchingImpl searchingImpl = new SearchingImpl();
        searchingImpl.selectDepartureDate();
    }

    @Then("I select the return date")
    public void iSelectTheReturnDate() {
        SearchingImpl searchingImpl = new SearchingImpl();
        searchingImpl.selectReturnDate();
    }

    @Then("I click search")
    public void iClickSearch() {
        SearchingImpl searchingImpl = new SearchingImpl();
        searchingImpl.clickSearch();
    }

    @And("I should see {string}")
    public void iShouldSee(String arg0) {
        SearchingImpl searchingImpl = new SearchingImpl();
        searchingImpl.iShouldSeeError();
    }

    @And("I shouldn't be able to click the left button on the departure date")
    public void iShouldnTBeAbleToClickTheLeftButtonOnTheDepartureDate() {
        SearchingImpl searchingImpl = new SearchingImpl();
        searchingImpl.checkCanIClickLeftButton();
    }

    @Then("I enter Washington DC in the destination field")
    public void iEnterWashingtonDCInTheDestinationField() {
        SearchingImpl searchingImpl = new SearchingImpl();
        searchingImpl.enterDCInDestinationField();
    }

    @And("I should see the map")
    public void iShouldSeeTheMap() {
        SearchingImpl searchingImpl = new SearchingImpl();
        searchingImpl.iShouldSeeTheMap();
    }
}
