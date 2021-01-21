package webMD.StepDef;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webMD.Actions.QuestionsAndAnswersActions;

public class QuestionsAndAnswersStepDef {

	QuestionsAndAnswersActions QA = new QuestionsAndAnswersActions();
	
	@When("I move the mouse over to health a-z")
	public void i_move_the_mouse_over_to_health_a_z() {
		QA.mouseHover();
		
	}

	@When("I click on Questions and answers")
	public void i_click_on_Questions_and_answers() throws InterruptedException {
		QA.clickQuestionsAndAnswersLink();
			
	}

	@When("I land on the browse by topic page")
	public void i_land_on_the_browse_by_topic_page() {
		Assert.assertEquals(QA.verifyListOfTopics(), true);
		
	}

	@When("I click on eating disorders")
	public void i_click_on_eating_disorders() throws InterruptedException {
		QA.clickEatingDisorderLink();
		
	}

	@When("I land on the eating disorder questions and answers")
	public void i_land_on_the_eating_disorder_questions_and_answers() {
		Assert.assertEquals(QA.verifyEatingDisorderQuestionsLink(), true);
		
	}

	@When("I click on the types of eating disorder question")
	public void i_click_on_the_types_of_eating_disorder_question() throws InterruptedException { 
		QA.clickTypesOfEatingDisordersQuestion();
	}

	@Then("I should be taken to the answer")
	public void i_should_be_taken_to_the_answer() {
		Assert.assertEquals(QA.verifyAnswerPage(), true);
	
	}

	
	
}
