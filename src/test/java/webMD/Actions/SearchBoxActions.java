package webMD.Actions;

import org.openqa.selenium.support.PageFactory;

import webMD.PageElements.SearchBoxElements;
import webMD.Utilities.SetupDrivers;

public class SearchBoxActions {
	SearchBoxElements searchBoxAct;
	
	public SearchBoxActions () {
		this.searchBoxAct = new SearchBoxElements();
		PageFactory.initElements(SetupDrivers.chromeDriver, searchBoxAct);
		
	}
	
	public void clickOnSearchBox () {
		searchBoxAct.SearchLink.click();
		
	}
	
	public void topicToSearch (String search) {
		searchBoxAct.searchBox.sendKeys(search);
		
	}
	
	public void clickOnSearchBtn () {
		searchBoxAct.searchBtn.click();
		
	}
	
	public boolean verifySearchResult() {
		boolean bool = false;
		if(searchBoxAct.searchResult.isDisplayed()) {
			bool = true;
		}
		return bool;
	
	}
	

	
	
}
