package webMD.StepDef;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import webMD.Actions.DepressionQuizActions;

public class DepressionQuizStepDefinition {
	DepressionQuizActions Quiz = new DepressionQuizActions();

	@Given("I move the mouse over the tab {string}")
	public void i_move_the_mouse_over_the_tab(String string) {
		Quiz.mousehover();

	}

	@Given("I click on link {string}")
	public void i_click_on_link(String string) {
		Quiz.clickDepressionLink();

	}

	@Given("I land on Depression page")
	public void i_land_on_Depression_page() {
		Assert.assertEquals(Quiz.verifyDepressionPage(), true);

	}

	@Given("I click on menu button")
	public void i_click_on_menu_button() {
		Quiz.clickMenuBtn();

	}

	@Given("I click on Quizzes link")
	public void i_click_on_Quizzes_link() {
		Quiz.clickquizzeslink();

	}

	@Given("I land on Depression Quizzes Page")
	public void i_land_on_Depression_Quizzes_Page() {
		Assert.assertEquals(Quiz.verifyDepressionQuizPage(), true);

	}

	@Given("I click on Myths and Facts About Depression Symptoms link")
	public void i_click_on_Myths_and_Facts_About_Depression_Symptoms_link() {

		Quiz.clickSymptomsLink();
	}

	@Given("I land on the page with first quiz")
	public void i_land_on_the_page_with_first_quiz() {
		Assert.assertEquals(Quiz.verifyQuizPage(), true);

	}

	@Given("I am able to select the answers and complete the quizzes")
	public void i_am_able_to_select_the_answers_and_complete_the_quizzes() throws InterruptedException {
//	for(int i=0; i<=7; i++) {
		Quiz.clickAnswer1();
		Quiz.clickNext();


		Thread.sleep(5000);
		// Quiz.clickAnswer2();

//	}
	}

	@Then("I am able to see the quiz result")
	public void i_am_able_to_see_the_quiz_result() throws InterruptedException {
		
		Thread.sleep(5000);
//Quiz.clickAnswer1();
		//Assert.assertEquals(Quiz.verifyQuizResult(), true);

	}
}
