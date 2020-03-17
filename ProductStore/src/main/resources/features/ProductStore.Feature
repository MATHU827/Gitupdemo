Feature: Product_Store
@Tc01_SignUp
Scenario: 
	Sign Up to Product store 
	Given the user launched the chrome browser 
	When the user opens product store  homepage 
	Then the user enters username and password 
	Then  the user clicks signup
	And the user close the application 
	
@Tc02_Login
Scenario: 
	Login to Product store 
	Given  user launched the chrome browser
	When  user opens product store  homepage 
	Then  user enters username and password 
	Then   user clicks login

@Tc03_Add_to_cart
Scenario: 
	To add a product to cart 
	Given  user launched the chrome Browser
	When  user opens product store  Homepage 
	Then  user clicks on product and add to cart 
	
@Tc04_Contact
Scenario: 
	To contact 
	Given  user launched the Chrome Browser
	When  user opens Product store  Homepage 
	Then  user clicks contact
	Then  user enters contact details
	Then  user clicks send message
	
@Tc05_clickproduct
Scenario: 
	To select a product 
	Given  user launched the Chrome_Browser
	When  user opens Product Store  Homepage 
	Then  user clicks next
	Then  user selects product
	
@Tc06_DeleteCart
Scenario: 
	To delete a product
	Given  user launched the Chrome_browser
	When  user opens Product store homepage 
	Then  user clicks cart
	Then  delete the product in cart 
	
@Tc07_SelectLaptop
Scenario: 
	To get price of a specific laptop
	Given  User launched the chrome_browser
	When  User opens Product store homepage 
	Then  User clicks laptop tab

@Tc08_To_check_phone_number
Scenario: 
	To check phone no
	Given The User launched the Chrome_Browser
	When  User opens product Store homepage 
	Then  User checks if the number is valid
	
@Tc09_To_get_description
Scenario: 
	To get the  product description
	Given The User launched the Chrome_browser
	When  The User opens product Store homepage 
	Then  User gets the description of the specific product  
	
@Tc10_To_add_two_product
Scenario: 
	To add more than one  product to cart
	Given The User launch the Chrome_browser
	When  The User open product Store homepage 
	Then  user need to add more than one products in cart
	
@Tc11_Valid_PlaceOrder
Scenario:
	To place order
	Given  launched the chrome page
	When open demoblaze homepage
	Then click cart and place order
	Then Give all detail
	And application is closed
	
@Tc12_Invaild_placeorder
Scenario:
	To print the alert
	Given user launch chrome
	When user open demo application
	Then Then click cart and place order
	Then click purchase
	And close the application

@Tc13_To_get_monitor_price
Scenario:	
	To print name of the apple motitor 24
	Given open the chrome page
	When user Opens demo app
	Then The user clicks monitors
	Then click apple monitor and print price
	And close app
				
@Tc14_aboutus
Scenario:	
	To check the video is playing and it displays in full screen
	Given Chrome web page
	When DemoWebshop app
	Then click aboutus
	Then play video in full screen
	And Close demo app

@Tc15-Count_of_mobiles
Scenario:
	To count total element in the webpage 
	Given chrome pages 
	When demo page
	Then count element
	Then close the chrome
