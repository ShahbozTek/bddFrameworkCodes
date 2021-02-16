package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class Laptops_NoteBooksPageObj extends Base{

	public Laptops_NoteBooksPageObj() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@alt='Laptops & Notebooks']")
	private WebElement laptopsAndNotebooksImg;
	
	@FindBy(xpath = "(//a[text()='Macs (0)'])[2]")
	private WebElement refineSearchMacs;
	
	@FindBy(xpath = "(//a[text()='Windows (0)'])[2]")
	private WebElement refineSearchWindows;
	
	@FindBy(xpath = "//select[@id='input-sort']")
	private WebElement dropdownSortBy;
	
	@FindBy(xpath = "//select[@id='input-limit']")
	private WebElement dropdownShow;
	
	@FindBy(xpath = "//a[text()='Product Compare (0)']")
	private WebElement productCompare;
	
	@FindBy(xpath = "//i[@class='fa fa-th-list']")
	private WebElement listView;
	
	@FindBy(xpath = "//i[@class='fa fa-th']")
	private WebElement gridView;
	
	@FindBy(xpath = "//a[text()='HP LP3065']")
	private WebElement hpComputer;
	
	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement macBook;
	
	@FindBy(xpath = "//a[text()='MacBook Air']")
	private WebElement macBookAir;
	
	@FindBy(xpath = "//a[text()='MacBook Pro']")
	private WebElement macBookPro;
	
	@FindBy(xpath = "//a[text()='Sony VAIO']")
	private WebElement sonyVAIO;
	
	//Methods to perform required actions
	
	public boolean laptopImageIsDisplayed() {

		if (laptopsAndNotebooksImg.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void refineSearchToMacs() {
		WebDriverUtility.clickOnElement(refineSearchMacs);
	}
	
	public void refineSearchToWindows() {
		WebDriverUtility.clickOnElement(refineSearchWindows);
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
	
	public void selectHPComputer() {
		WebDriverUtility.clickOnElement(hpComputer);
	}
	
	public void selectMacBook() {
		WebDriverUtility.clickOnElement(macBook);
	}
	
	public void selectMacBookAir() {
		WebDriverUtility.clickOnElement(macBookAir);
	}
	
	public void selectMacBookPro() {
		WebDriverUtility.clickOnElement(macBookPro);
	}
	
	public void selectSonyVAIO() {
		WebDriverUtility.clickOnElement(sonyVAIO);
	}
	
		
	
}
