package webMD.Actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import webMD.PageElements.QuestionsAndAnswersElements;
import webMD.Utilities.SetupDrivers;

public class QuestionsAndAnswersActions {

	QuestionsAndAnswersElements QAElements;
	
	public QuestionsAndAnswersActions() {
		this.QAElements = new QuestionsAndAnswersElements();
		PageFactory.initElements(SetupDrivers.chromeDriver, QAElements);
		
	}
	
	public void mouseHover() {
		Actions actions = new Actions(SetupDrivers.chromeDriver);
		actions.moveToElement(QAElements.Healthlink);
		
	}
	
	public void clickQuestionsAndAnswersLink() throws InterruptedException {
		QAElements.QuestionsAnswersLink.click();
		Thread.sleep(2000);
		
	}
	
	public boolean verifyListOfTopics() {
		boolean bool = false;
		if(SetupDrivers.chromeDriver.getTitle().contains("Questions")) {
			bool = true;
		}
		return bool;
		
	}
	
	public void clickEatingDisorderLink() throws InterruptedException {
		QAElements.EatingDisordersBtn.click();
		Thread.sleep(2000);
		
	}
	
	public boolean verifyEatingDisorderQuestionsLink() {
		boolean bool = false;
		if(SetupDrivers.chromeDriver.getCurrentUrl().contains("https://www.webmd.com/mental-health/eating-disorders/qa/default.htm")) {
			bool = true;
		}
		return bool;
		
	}
	
	public void clickTypesOfEatingDisordersQuestion () throws InterruptedException {
		QAElements.DisordersQuestionBtn.click();
		Thread.sleep(2000);
	}
	
	public boolean verifyAnswerPage() {
		boolean bool = false;
		if(SetupDrivers.chromeDriver.getCurrentUrl().contains("https://www.webmd.com/mental-health/eating-disorders/qa/what-are-the-different-types-of-eating-disorders")) {
			bool = true;
		}
		return bool;
	}
	
	
	
	
	
}
