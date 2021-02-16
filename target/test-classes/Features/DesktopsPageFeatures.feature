Feature: Verify Desktop Page Items

Background: 
Given User is on retail website
When User click on Desktops tab
And User click on show all Desktops


@VerifyItems
Scenario: User verify all items are present in Desktops tab 		
		Then User should see all items are present in Desktops page
		
@AddHPtoCart		
Scenario: User add HP LP 3065 from Desktops tab to the cart
		And User click ADD TO CART option on ‘HP LP3065’item
		And User select quantity (.+)
		And User click add to Cart button
		Then User should see a message ‘Success: you have added HP LP 3065 to your Shopping cart!’
		
		
		
		
		
		
		
		
		
		
		
		
		