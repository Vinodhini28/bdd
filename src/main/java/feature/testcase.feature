Feature: Place an Order in Demoborland site.

@LaunchandClick
Scenario: Launch demoborland and click on Enter GMO
Given I Launch the URL
When I verify the title as "Welcome to Green Mountain Outpost"
Then I click on EnterGMO Online Button

@Order
Scenario Outline: Enter the Quantity for the Hiking Boots Product
Given I Launch the URL
When I verify the title as "Welcome to Green Mountain Outpost"
And I click on EnterGMO Online Button
Then I verify the title as "OnLine Catalog"
Then I Enter the Quantity for the "<Product>" Product as "<Quantity>"
#Then I Enter the Quantity for the "1002" Product as "10"
Then I click on Place an Order Button
Then I Close the Browser

Examples:

    | Product | Quantity |
    | 1004    |    5     |
    | 1002    |   10     |
    | 1001    |   3      |
    
 @PageFact
 Scenario:  Launch demoborland and click on Enter GMO
 Given I Launch the Borland URL in Chrome
 When I Click on Enter GMO Online Button in GMO Online Page
 Then I enter Quantity as "10" in Online Catalog Page

 
