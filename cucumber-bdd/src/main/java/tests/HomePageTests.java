package tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageTests {
    @Given("I am on ebay home page")
    public void i_am_on_ebay_home_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I am on ebay home page");
    }
    @When("I click on advance link")
    public void i_click_on_advance_link() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I click on advance link");
    }
    @Then("I navigate to ebay search page")
    public void i_navigate_to_ebay_search_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I navigate to ebay search page");

    }
}
