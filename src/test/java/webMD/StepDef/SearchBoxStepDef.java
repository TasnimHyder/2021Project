package webMD.StepDef;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webMD.Actions.SearchBoxActions;

public class SearchBoxStepDef {
	
	SearchBoxActions searchAct = new SearchBoxActions();
	
	@When("I click on the searchbox")
	public void i_click_on_the_searchbox() {
		searchAct.clickOnSearchBox();
		
	}

	@When("I enter {string}")
	public void i_enter(String search) {
		searchAct.topicToSearch(search);
		
	}

	@When("I click the search button")
	public void i_click_the_search_button() {
		searchAct.clickOnSearchBtn();
		
	}

	@Then("I should be taken to the search result page")
	public void i_should_be_taken_to_the_search_result_page() {
		boolean Actual = searchAct.verifySearchResult();
		Assert.assertEquals(Actual, true);
		
	}

	
}
