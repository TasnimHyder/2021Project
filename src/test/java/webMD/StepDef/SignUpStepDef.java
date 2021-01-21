package webMD.StepDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webMD.Actions.SignUpActions;

public class SignUpStepDef {

	SignUpActions SignAct = new SignUpActions();
	
	@When("I click on sign in")
	public void i_click_on_sign_in()  throws InterruptedException {
		SignAct.signInLink();

	}

	@When("I click on sign up link")
	public void i_click_on_sign_up_link()  throws InterruptedException {
		SignAct.signUpLink(); 
		
	}
		

	@When("I enter correct email, password, dob")
	public void i_enter_correct_email_password_dob() throws InterruptedException {
		SignAct.emailPassDob();
		
	}
	
	@When("I click on sign up button")
	public void i_click_on_sign_up_button() throws InterruptedException {
		SignAct.clickSignUpButton();

	}

	@Then("I should be able to see my profile text")
	public void i_should_be_able_to_see_my_profile_text() {
		SignAct.myProfileText();
		
	}

	
}
