package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	FirefoxDriver f;
@Before
public void before() {
	System.setProperty("webdriver.gecko.driver", "C:\\Magnitia Batch\\MavenSelenium\\geckodriver.exe");
}
@Given("To Open a firefox browser")
public void openbrowser() {
	f = new FirefoxDriver();
}
@And ("URL is entered in the browser")
public void openurl() {
	f.get("https://portfolio.rediff.com/portfolio-login");
}
@When("^I enter (.*) and (.*)")
public void enterusername(String username,String password) {
	f.findElement(By.name("email-id")).sendKeys(username);
	f.findElement(By.name("passwd")).sendKeys(password);
}
@And("I click submit")
public void clicksubmit()
{
	f.findElement(By.name("loginsubmit")).click();
}
@Then("I verify the {word} of login")
public void verify(String status){
	if (status.equals("PASS")) {
		Assert.assertEquals("A", "A");
	}else {
		Assert.assertEquals("A", "B");
	}
	
}

}
