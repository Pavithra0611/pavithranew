package github_project;

import cucumber.api.java.en.Given;

public class eg3 {
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	   System.out.println("username");
	}

	@Given("some other precondition")
	public void some_other_precondition() {
	  System.out.println("password");
	}

}
