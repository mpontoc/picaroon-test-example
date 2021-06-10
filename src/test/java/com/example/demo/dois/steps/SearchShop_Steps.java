package com.example.demo.dois.steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.example.demo.dois.objects.Cornershoop_Objects;
import com.example.demo.dois.objects.Interface;

import br.com.mpontoc.picaroon.core.commands.ActionsCommands;
import br.com.mpontoc.picaroon.core.utils.Functions;
import br.com.mpontoc.picaroon.core.utils.Log;
import br.com.mpontoc.picaroon.core.utils.Prop;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchShop_Steps {

	@BeforeStep("@searchShop")
	public void reportClear(Scenario scenario) {
		ActionsCommands.isFirstRun = true;
		ActionsCommands.setScenario(scenario);
	}

	@AfterStep("@searchShop")
	public void report(Scenario scenario) {
		ActionsCommands.printScreenAfterStep(scenario);
	}

	@After
	public static void printTimeExecution() {
		if (Prop.getProp("printAfterSteps").equals("false")) {
			ActionsCommands.printScreen();
		}
		Functions.printTimeExecution();
	}
	
	@Autowired
	public Cornershoop_Objects objects;
//	Cornershoop_Objects objects = new Cornershoop_Objects();
	@Given("I want to locate the shops nearby me")
	public void i_want_to_locate_the_shops_nearby_me() {
		
		ActionsCommands.driver.get(Prop.getProp("siteURL"));
		
		Log.log(ActionsCommands.driver.getCurrentUrl());
		
	}

	@When("I send my zip code {string}")
	public void i_send_my_zip_code(String zipCode) {
		
		ActionsCommands.waitExistClick(objects.btCancel, 3, true);
		ActionsCommands.waitExistSet(objects.zipCode, zipCode, 3, true);
		ActionsCommands.waitExistClick(objects.btContinue, 3, true);

	}

	@Then("I can see the shops nearby me")
	public void i_can_see_the_shops_nearby_me() {
		// Write code here that turns the phrase above into concrete actions
	}

}
