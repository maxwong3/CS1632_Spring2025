package edu.pitt.cs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class ValueStepDefinitions {
	private Value value;
	// TODO: Fill in!
	@Given("a Value")
	public void aValue() {
		value = new Value();
	}

	@When("increment value")
	public void incrementValue() {
		value.incVal();
	}

	@When ("I get value")
	public void getValue() {
		value.getVal();
	}

	@Then("the value is: {int}")
	public void getValue(int value) {
		assertEquals(this.value.getVal(), value);
	}
}	
