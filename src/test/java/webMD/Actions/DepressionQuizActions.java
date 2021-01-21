package webMD.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import webMD.PageElements.DepressionQuizElements;
import webMD.Utilities.SetupDrivers;

public class DepressionQuizActions {

	DepressionQuizElements QuizElements;

	public DepressionQuizActions() {
		this.QuizElements = new DepressionQuizElements();
		PageFactory.initElements(SetupDrivers.chromeDriver, QuizElements);
	}

	public void mousehover() {
		Actions action = new Actions(SetupDrivers.chromeDriver);
		action.moveToElement(QuizElements.Healthlink);
	}

	public void clickDepressionLink() {
		QuizElements.Depressionlink.click();
	}

	public boolean verifyDepressionPage() {
		boolean bool = false;
		if (SetupDrivers.chromeDriver.getTitle().contains("Depression")) {
			bool = true;
		}
		return bool;
	}

	public void clickMenuBtn() {
		QuizElements.MenuBtn.click();
	}

	public void clickquizzeslink() {
		QuizElements.QuizzesLink.click();
	}

	public boolean verifyDepressionQuizPage() {
		boolean bool = false;
		if (SetupDrivers.chromeDriver.getCurrentUrl().contains("https://www.webmd.com/depression/quiz/default.htm")) {
			bool = true;
		}
		return bool;
	}

	public void clickSymptomsLink() {
		QuizElements.articleTitle.click();
	}

	public boolean verifyQuizPage() {
		boolean bool = false;
		if (SetupDrivers.chromeDriver.getCurrentUrl().contains("https://www.webmd.com/depression/rm-quiz-depression")) {
			bool = true;
		}
		return bool;
	}

	public void clickAnswer1() {
		WebDriverWait wait = new WebDriverWait(SetupDrivers.chromeDriver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(QuizElements.Truelink));
		QuizElements.Truelink.click();
		
		
//		QuizElements.Truelink.click();

	//	QuizElements.NextBtn.click();

//}
	}

	public void clickAnswer2() {
		QuizElements.Truelink.click();
		WebDriverWait wait = new WebDriverWait(SetupDrivers.chromeDriver, 10);
		wait.until(ExpectedConditions.textToBePresentInElement(QuizElements.NextBtn, "Next"));
		QuizElements.NextBtn.click();
		QuizElements.NextBtn.click();

	}

	public void clickNext() {
		WebDriverWait wait1 = new WebDriverWait(SetupDrivers.chromeDriver, 10);
		wait1.until(ExpectedConditions.elementToBeClickable(QuizElements.NextBtn));
		Actions action = new Actions(SetupDrivers.chromeDriver);
		action.moveToElement(QuizElements.NextBtn).click().perform();
//		JavascriptExecutor jse = (JavascriptExecutor)SetupDrivers.chromeDriver;
//		jse.executeScript("arguments[0].click()", 	QuizElements.NextBtn);
//		System.out.println(QuizElements.NextBtn.getText());
	}

	public boolean verifyQuizResult() {
		boolean bool = false;
//		  if(QuizElements.Quizresult.isDisplayed()) {
//			  bool = true;
//		  }
//		  return bool;

		if (QuizElements.Test.isDisplayed()) {
			bool = true;
		}
		return bool;
	}
}
