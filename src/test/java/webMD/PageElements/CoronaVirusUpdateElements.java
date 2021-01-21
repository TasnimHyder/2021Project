package webMD.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoronaVirusUpdateElements {
	@FindBy(linkText = "CORONAVIRUS UPDATE")
	public WebElement CoronavirusLink;
	
	@FindBy(xpath = "//h1[contains(text(),'the latest updates')]")
	public WebElement CoronaVirusUpdateVerify;
	
	@FindBy(css = "#ContentPane12 > section > div > div > div.leaflet-pane.leaflet-map-pane > div.leaflet-pane.leaflet-overlay-pane > svg > g > path:nth-child(49)")
	public WebElement Wyoming;
	
	@FindBy(css = "#ContentPane12 > section > div > div > div.leaflet-pane.leaflet-map-pane > div.leaflet-pane.leaflet-overlay-pane > svg > g > path:nth-child(15)")
	public WebElement Kansas;
	
	@FindBy(xpath = "//h2[contains(text(),'Wyoming')]")
	public WebElement ResultWyoming;
	
	@FindBy(xpath = "//h2[contains(text(),'Kansas')]")
	public WebElement ResultKansas;
}
