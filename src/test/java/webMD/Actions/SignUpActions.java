package webMD.Actions;

import org.openqa.selenium.Keys;

import webMD.PageElements.SignUpElements;

public class SignUpActions {

	SignUpElements SignUpE;
	
	public SignUpActions () {
		this.SignUpE = new SignUpElements();
		
	}
	
	public void signInLink() throws InterruptedException {
		SignUpE.cookiesIcon.click();
		Thread.sleep(2000);
		SignUpE.signinLink.click();
		Thread.sleep(2000);
		
	}
	
	public void signUpLink() throws InterruptedException {
		SignUpE.signupLink.click();
		Thread.sleep(2000);
		
	}
	
	public void emailPassDob() throws InterruptedException {
		SignUpE.email.sendKeys("newnew@gmail.com");
		Thread.sleep(2000);
		SignUpE.pass.sendKeys("talentech1");
		Thread.sleep(2000);
		SignUpE.pass.sendKeys(Keys.TAB);
		SignUpE.dateOfBirth.sendKeys("12202003");
		
	}
	
	public void clickSignUpButton() throws InterruptedException {
		SignUpE.signupButton.click();
		Thread.sleep(2000);
		
	}
	
	public void myProfileText() {
		SignUpE.signinText.isDisplayed();
		
	}
	
}
