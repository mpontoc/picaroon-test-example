package com.example.demo.steps;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.mpontoc.picaroon.core.commands.ActionsCommands;
import io.github.mpontoc.picaroon.core.utils.Functions;

public class Example_Steps {
	
	@BeforeStep("@tag")
	public void reportClear(Scenario scenario) {
//		ActionsCommands.isFirstRun = true;
		ActionsCommands.setScenario(scenario);
	}

	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("test1");
		Functions.printInfoExec();
		
		String response = "{\n"
				+ "   \"links\":[\n"
				+ "      {\n"
				+ "         \"id\":28,\n"
				+ "         \"Title\":\"Sweden\"\n"
				+ "      },\n"
				+ "      {\n"
				+ "         \"id\":56,\n"
				+ "         \"Title\":\"USA\"\n"
				+ "      },\n"
				+ "      {\n"
				+ "         \"id\":89,\n"
				+ "         \"Title\":\"England\"\n"
				+ "      }\n"
				+ "   ]\n"
				+ "}";
		
		JSONArray arr = null;
		
		try {
			JSONObject obj = new JSONObject(response);
			arr = obj.getJSONArray("links");
			System.out.println(arr);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < arr.length(); i++)
			
			try {
				JSONObject valor = arr.getJSONObject(i);
				
				System.out.println(valor.get("Title"));
				System.out.println(valor.get("id"));
				System.out.println(valor);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}

	@Given("some other precondition")
	public void some_other_precondition() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("test2");
	}

	@When("I complete action")
	public void i_complete_action() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("test3");
	}

	@When("some other action")
	public void some_other_action() {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
		// Write code here that turns the phrase above into concrete actions
	}

}
