package bookingforfamily;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepfileforbooking {

@Given ("I want to book tickets for {word} in booking website")
public void given(String name) {
	System.out.println("I want to book tickets for" + name +"in booking website");
	}
@And("I want to check for the site with best offers")
public void and() {
	System.out.println("I want to check for the site with best offers");
}
@When("I openend booking site for booking tickets")
public void when() {
	System.out.println("I openend booking site for booking tickets");
}
@Then("I booked tickets for {word}")
public void then(String familynames) {
	System.out.println("I booked tickets for" + familynames);
}
}
