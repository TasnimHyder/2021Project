package webMD.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import webMD.PageElements.FindaDoctorElements;
import webMD.Utilities.SetupDrivers;

public class FindaDoctorActions {
	// WebDriver chromeDriver;
	FindaDoctorElements doctorElements;

	public FindaDoctorActions( /* WebDriver chromeDriver */ ) {
		this.doctorElements = new FindaDoctorElements( /* chromeDriver */ );
//		SetupDrivers.setupChromeDriver();
		PageFactory.initElements(SetupDrivers.chromeDriver, doctorElements);
	}

	public void getwebMDHomepage() {
		SetupDrivers.chromeDriver.get("https://www.webmd.com/");
		SetupDrivers.chromeDriver.manage().window().maximize();
		SetupDrivers.chromeDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	}

	public void cookieClose() {
		doctorElements.cookie.click();
	}

	public void clickFindaDoctor() {
		doctorElements.link.click();
	}

	public boolean verifyFindaDocPage() {
		boolean bool = false;
		System.out.println(SetupDrivers.chromeDriver.getTitle());
		if (SetupDrivers.chromeDriver.getTitle().contains("Find Doctors Near You")) {
			bool = true;
		}
		return bool;
	}

	public void enterdoctorinfo(String string) {

		doctorElements.firstSearchBar.sendKeys(string);
	}

	public void enterTabBtn() {
		doctorElements.firstSearchBar.sendKeys(Keys.TAB);
	}

	public void enterzip(String zip) {
		doctorElements.secondSearchBar.sendKeys(zip);
		;

	}

	public void enterBtn() {
		doctorElements.firstSearchBar.sendKeys(Keys.ENTER);
	}

	public boolean verifyWebMDHomepage() {
		boolean bool = false;
		if (SetupDrivers.chromeDriver.getTitle().contains("WebMD")) {
			bool = true;
		}
		return bool;
	}

	public boolean verifyFindaDoctorResult() {
		boolean bool = false;
		if (doctorElements.searchResult.isDisplayed()) {
			bool = true;
		}
		return bool;
	}

	public boolean verifyErrorMsg() {
		boolean bool = false;
		if (doctorElements.errorMsg.isDisplayed()) {
			bool = true;
		}
		return bool;
	}
}
