package webMD.StepDef;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import webMD.Actions.CoronaVirusUpdateActions;
import webMD.Utilities.SetupDrivers;

public class CoronaVirusUpdateStepDefinition {
	String State;
	CoronaVirusUpdateActions CoronaAction = new CoronaVirusUpdateActions();

	@Given("I click on the Corona Virus Update Link")
	public void i_click_on_the_Corona_Virus_Update_Link() {
		CoronaAction.clickCoronaUpdateLink();

	}

	@Given("I land on the Corona Virus Update page")
	public void i_land_on_the_Corona_Virus_Update_page() {
		Assert.assertEquals(CoronaAction.verifyVirusUpdatePage(), true);

	}

	@Given("I click on {string} on the United States map")
	public void i_click_on_on_the_United_States_map(String State) {
		this.State=State;
		System.out.println("State Name:" + State);
		CoronaAction.clickState(State);

	}

	
	
	@Then("I am shown Corona Virus updates for the State")
	public void i_am_shown_Corona_Virus_updates_for_the_state() {
		System.out.println("Result for: " +  State);
		Assert.assertEquals(CoronaAction.verifyupdateResult(), true);
//		if(State=="Wyoming") {
//			Assert.assertEquals(SetupDrivers.chromeDriver.findElement(By.xpath("//h2[contains(text(),'Wyoming')]")), true);
//		}
//		else if (State=="Kansas"){
//			Assert.assertEquals(SetupDrivers.chromeDriver.findElement(By.xpath("//h2[contains(text(),'Kansas')]")), true);
//		}
//		else {
//			fail();
//			System.out.println("Failed to find desired Result");
//		}


	}
}
