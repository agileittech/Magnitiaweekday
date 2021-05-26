package booking;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Bookingstepfile {
@Given("^I want to book tickets for ([a-zA-Z]{1,}) in booking website$")
public void given(String typeofbooking) {
	System.out.println("Need to open booking website successfully for" + typeofbooking);
}
@And("I want to check for the site with best offers")
public void and() {
	System.out.println("Check offers");
}
@When("^I openend booking site$")
public void when() {
	System.out.println("Openend booking website");
}
@But("I found that site giving offers only for to and fro")
public void but() {
	System.out.println("offers only fot to and fro ");
}
@Then("I {string} paris")
public void then(String status) {
	System.out.println("booked tickets to paris" + status);
}
}

