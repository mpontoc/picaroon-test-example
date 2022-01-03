package com.example.demo.config;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.github.mpontoc.picaroon.core.commands.ActionsCommands;
import io.github.mpontoc.picaroon.core.config.Execution;
import io.github.mpontoc.picaroon.core.constants.PropertiesConstants;
import io.github.mpontoc.picaroon.core.drivers.DriverFactory;
import io.github.mpontoc.picaroon.core.utils.Functions;
import io.github.mpontoc.picaroon.core.utils.Report;

public class Hooks {

	@Before
	public void setAppMobile(Scenario scenario) {

		ActionsCommands.setScenario(scenario);
		if (PropertiesConstants.BROWSER_OR_MOBILE.contains("mobile")) {

			if (Execution.getAppRunner() == true) {
				DriverFactory.newApp();
			}
		}
	}

	@BeforeStep
	public void reportBeforeStep(Scenario scenario) {

		ActionsCommands.setScenario(scenario);
		Execution.setIsFirstRun(true);
		
		if (ActionsCommands.getPrintedInfo() == null) {
			Functions.printInfoExec();
		}
	}

	@AfterStep
	public void reportAfterStep(Scenario scenario) {

		if (DriverFactory.driver != null) {
			Report.printScreenAfterStep(scenario);
		}
	}

	@After
	public static void printTimeExecution() {

		if (PropertiesConstants.PRINT_AFTER_STEPS.equals("false")) {
			Report.printScreen();
		}
		Functions.printTimeExecution();
		Execution.setHoraFinalTotal(Functions.retornaData().substring(11));
		Report.cucumberWriteReport("Total execution time until 'moment/final'"
				+ Functions.substractHours(Execution.getHoraInicialTotal(), Execution.getHoraFinalTotal()));
		ActionsCommands.setPrintedInfo(null);
	}

}
