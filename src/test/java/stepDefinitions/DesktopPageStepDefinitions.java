package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;

import core.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.DesktopsPageObj;
import utilities.WebDriverUtility;

public class DesktopPageStepDefinitions extends Base{

	DesktopsPageObj desktopsPage = new DesktopsPageObj();
	
	////////User verify all items are present in Desktops tab//////
	
	@Given("^User is on retail website$")
	public void user_is_on_retail_website() throws Throwable {
		Base.initializeDriver();
		logger.info("Retail page is opened");
		String actualPageTitle = desktopsPage.getPageTitle();
		String expectedPageTitle = "TEK SCHOOL";
		Assert.assertEquals(expectedPageTitle, actualPageTitle);
		logger.info("Page title  is verified");
		WebDriverUtility.screenShot();
	}
	
	@When("^User click on Desktops tab$")
	public void user_click_on_Desktops_tab() throws Throwable {
	   desktopsPage.clickOnDesktopsTab();
	   logger.info("User clicked on Desktops tab");
	   WebDriverUtility.screenShot();
	}
	
	@When("^User click on show all Desktops$")
	public void user_click_on_show_all_Desktops() throws Throwable {
	    desktopsPage.clickOnShowAllDesktops();
	    logger.info("User clicked on show all desktops");
	    WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
	}
	
	@Then("^User should see all items are present in Desktops page$")
	public void user_should_see_all_items_are_present_in_Desktops_page() throws Throwable {
		WebDriverUtility.screenShot();
	}
	
	//////User add HP LP 3065  from Desktops tab to the cart////////
	
	@When("^User click ADD TO CART option on ‘HP LP(\\d+)’item$")
	public void user_click_ADD_TO_CART_option_on_HP_LP_item(int arg1) throws Throwable {
	    desktopsPage.addToCartHPComputer();
	    WebDriverUtility.wait(3000);
	    WebDriverUtility.screenShot();
	    WebDriverUtility.acceptAlert();
	}
	
	@When("^User select quantity (.+)$")
	public void user_select_quantity(int arg1) throws Throwable {
	    WebDriverUtility.screenShot();
	}
	
	@When("^User click add to Cart button$")
	public void user_click_add_to_Cart_button() throws Throwable {
		desktopsPage.addToCartHPComputerOnHPComputerPage();
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
	}
	
	@Then("^User should see a message ‘Success: you have added HP LP (\\d+) to your Shopping cart!’$")
	public void user_should_see_a_message_Success_you_have_added_HP_LP_to_your_Shopping_cart(int arg1) throws Throwable {
	   WebDriverUtility.screenShot();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
