package webMD.Actions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import webMD.PageElements.FacebookElements;
import webMD.Utilities.SetupDrivers;

public class FacebookActions {
	FacebookElements FbElements;

	public FacebookActions() {
		this.FbElements = new FacebookElements();
		PageFactory.initElements(SetupDrivers.chromeDriver, FbElements);
	}
	
	public void clicklikeFBbtn(){
		JavascriptExecutor jse = (JavascriptExecutor)SetupDrivers.chromeDriver;
		jse.executeScript("arguments[0].click()", FbElements.likeFacebookLink);
//		FbElements.likeFacebookLink.click();
	}
	
	
	public void clickfacebookIcon() {
		FbElements.facebookLink.click();
	}
	
	public boolean verifyFBPage() {
		boolean bool = false;
		
		WebDriverWait wait = new WebDriverWait(SetupDrivers.chromeDriver, 15);
		wait.until(ExpectedConditions.titleContains("Facebook"));
		if (SetupDrivers.chromeDriver.getTitle().contains("Facebook")) {
			bool = true;
		}
		return bool;
	}
	
	public void clickTwitterIcon() {
		FbElements.twitterLink.click();
	}
	
	public boolean verifyTwitterPage() {
		boolean bool = false;
		WebDriverWait wait = new WebDriverWait(SetupDrivers.chromeDriver, 15);
		wait.until(ExpectedConditions.titleContains("Twitter"));
		if (SetupDrivers.chromeDriver.getTitle().contains("Twitter")) {
			bool = true;
		}
		return bool;
	}
	
	public void clickPinterestIcon() {
		FbElements.pinterestlink.click();
	}
	
	public boolean verifyPinterestPage() {
		boolean bool = false;
		WebDriverWait wait = new WebDriverWait(SetupDrivers.chromeDriver, 15);
		wait.until(ExpectedConditions.titleContains("Pinterest"));
		if (SetupDrivers.chromeDriver.getTitle().contains("Pinterest")) {
			bool = true;
		}
		return bool;
	}
}
