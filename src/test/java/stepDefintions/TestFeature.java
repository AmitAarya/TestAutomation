package stepDefintions;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestFeature {
	
	
	@Given("^Inside given$")
	public void inside_given() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Inside given step");
	}

	@When("^Inside when$")
	public void inside_when() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("inside when step");
	    
	}

	@Then("^Inside then$")
	public void inside_then() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside then step");
		 Assert.fail();
	    
	}
	
	
	@Given("^Inside given_(\\d+)$")
	public void inside_given_(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Inside given_1");
	}

	@When("^Inside when_(\\d+)$")
	public void inside_when_(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Inside when_1");
	}

	@Then("^Inside then_(\\d+)$")
	public void inside_then_(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Inside then_1");
	   
	}
	
	
	
	@Given("^Inside given_One$")
	public void inside_given_One() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside given_One");
	}

	@When("^Inside when_One$")
	public void inside_when_One() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside when_One");
	}

	@Then("^Inside then_One$")
	public void inside_then_One() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside then_One");
	}



}
