package webMD.StepDef;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import webMD.Utilities.SetupDrivers;

public class BeforeActions {

	@Before
	public void beforeScenario(Scenario scen) {
		System.out.println("..Driver initilization..");
		SetupDrivers.setupChromeDriver();
		System.out.println("..ChromeDriver initialized..");
		System.out.println("scene.getName");
	}

}
