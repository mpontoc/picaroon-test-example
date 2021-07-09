package com.example.demo.conf;

import br.com.mpontoc.picaroon.core.commands.ActionsCommands;
import br.com.mpontoc.picaroon.core.utils.Functions;
import br.com.mpontoc.picaroon.core.utils.Prop;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;

public class Hooks {

	private boolean isPrintedInfo = false;

	@BeforeStep()
	public void reportClear(Scenario scenario) {
		ActionsCommands.setScenario(scenario);
		ActionsCommands.isFirstRun = true;
		if (isPrintedInfo == false) {
			Functions.printInfoExec();
			isPrintedInfo = true;
		}
	}

	@AfterStep()
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

}
