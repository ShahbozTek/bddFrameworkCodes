package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class DesktopsPageObj extends Base{

	
	
	
	public DesktopsPageObj() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktops;
	
	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktopsTab;
	
	@FindBy(xpath = "//img[@title='Desktops']")
	private WebElement desktopImg;
	
	@FindBy(xpath = "(//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=20_26'])[3]")
	private WebElement refineSearchPC;
	
	@FindBy(xpath = "(//a[@href='http://tek-school.com/retail/index.php?route=product/category&path=20_27'])[3]")
	private WebElement refineSearchMac;
	
	@FindBy(xpath = "//select[@id='input-sort']")
	private WebElement dropdownSortBy;
	
	@FindBy(xpath = "//select[@id='input-limit']")
	private WebElement dropdownShow;
	
	@FindBy(xpath = "//a[@id='compare-total']")
	private WebElement productCompare;
	
	@FindBy(xpath = "//i[@class='fa fa-th-list']")
	private WebElement listView;
	
	@FindBy(xpath = "//i[@class='fa fa-th']")
	private WebElement gridView;
	
	@FindBy(xpath = "//a[text()='Apple Cinema 30\"']")
	private WebElement appleCinema30;
	
	@FindBy(xpath = "//a[text()='Canon EOS 5D']")
	private WebElement canonEOS;
	
	@FindBy(xpath = "//a[text()='HP LP3065']")
	private WebElement hpComputer;
	
	@FindBy(xpath = "(//button[@type='button'])[15]")
	private WebElement addToCartHPComputer;
	
	@FindBy(xpath = "//button[text()='Add to Cart']")
	private WebElement addToCartHPComputerOnHPComputerPage;
	
	@FindBy(xpath = "//a[text()='HTC Touch HD']")
	private WebElement htcTouch;
	
	@FindBy(xpath = "//a[text()='iPhone']")
	private WebElement iPhone;
	
	@FindBy(xpath = "//a[text()='iPod Classic']")
	private WebElement iPodClassic;
	
	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement macBook;
	
	@FindBy(xpath = "//a[text()='MacBook Air']")
	private WebElement macBookAir;
	
	@FindBy(xpath = "//a[text()='Palm Treo Pro']")
	private WebElement palmTreoPro;
	
	@FindBy(xpath = "//a[text()='Product 8']")
	private WebElement product8;
	
	@FindBy(xpath = "//a[text()='Samsung SyncMaster 941BW']")
	private WebElement samsungSyncMaster;
	
	@FindBy(xpath = "//a[text()='Sony VAIO']")
	private WebElement sonyVAIO;
	
	//Methods to perform required actions
	
	public boolean desktopImageIsDisplayed() {

		if (desktopImg.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void refineSearchToPC() {
		WebDriverUtility.clickOnElement(refineSearchPC);
	}
	
	public void refineSearchToMac() {
		WebDriverUtility.clickOnElement(refineSearchMac);
	}
	
	public void sortByDropdown() {
		WebDriverUtility.clickOnElement(dropdownSortBy);
	}
	
	public void showDropdown() {
		WebDriverUtility.clickOnElement(dropdownShow);
	}
	
	public void productCompare() {
		WebDriverUtility.clickOnElement(productCompare);
	}
	
	public void selectListView() {
		WebDriverUtility.clickOnElement(listView);
	}
	
	public void selectGridView() {
		WebDriverUtility.clickOnElement(gridView);
	}
	
	public void selectAppleCinema30() {
		WebDriverUtility.clickOnElement(appleCinema30);
	}
	
	public void selectCanonEOS() {
		WebDriverUtility.clickOnElement(canonEOS);
	}
	
	public void selectHPComputer() {
		WebDriverUtility.clickOnElement(hpComputer);
	}
	
	public void selectHTCTouch() {
		WebDriverUtility.clickOnElement(htcTouch);
	}
	
	public void selectiPhone() {
		WebDriverUtility.clickOnElement(iPhone);
	}
	
	public void selectiPodClassic() {
		WebDriverUtility.clickOnElement(iPodClassic);
	}
	
	public void selectMacBook() {
		WebDriverUtility.clickOnElement(macBook);
	}
	
	public void selectMacBookAir() {
		WebDriverUtility.clickOnElement(macBookAir);
	}
	
	public void selectPalmTreoPro() {
		WebDriverUtility.clickOnElement(palmTreoPro);
	}
	
	public void selectProduct8() {
		WebDriverUtility.clickOnElement(product8);
	}
	
	public void selectSamsungSyncMaster() {
		WebDriverUtility.clickOnElement(samsungSyncMaster);
	}
	
	public void selectSonyVAIO() {
		WebDriverUtility.clickOnElement(sonyVAIO);
	}
	
	public String getPageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}
	
	public void clickOnDesktopsTab() {
		WebDriverUtility.clickOnElement(desktopsTab);		
	}
	
	public void clickOnShowAllDesktops() {
		WebDriverUtility.clickOnElement(showAllDesktops);		
	}	
	
	public void addToCartHPComputer() {
		WebDriverUtility.clickOnElement(addToCartHPComputer);
	}
	
	public void addToCartHPComputerOnHPComputerPage() {
		WebDriverUtility.clickOnElement(addToCartHPComputerOnHPComputerPage);
	}
	
	
	
	
	
	
}
