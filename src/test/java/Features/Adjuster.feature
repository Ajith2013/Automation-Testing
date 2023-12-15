#Author:  Ajithkumar.Soundararajan@aroopatech.com

@Adjuster
Feature: To create an adjuster from Adjuster Menu

  #Background:
  @Create
  Scenario Outline: To Verify A User can be able to create a Adjuster from Adjuster menu.
    Given A User launch A "<Browser>" Browser
    And A User Navigate to the Login  Url ""
    And A User enter the Username  ""
    And A User enter the Password  ""
    And A User clicks The Login Button
    Then A user verify Logined Successfully
    And A User clicks Adjuster menu
    Then A User verify All Adjuster label
    And A User click Add adjuster button
    And A User Enter the First name ""
    And A User Enter A Second name " "
    And A User Enter A Payroll id ""
    And A User Enter Associated id ""
    And A User Enter Bank Threshold ""
    Then A User select A DOB date
    And A User Enter A Tax Id ""
    And A User Enter  Notification Email ""
    #Then A User select Test group
    And A User select Address type as Business
    And A User Enter An Address1 on adjuster page " "
    And A User Enter a Zipcode on adjuster page " "
    And A User Enter a City on adjuster page   " "
    And A User Enter  a State on adjuster page "  "
    And A User Select Email Type dropdown in Adjuster page
    And A User Enter Email id in Adjuster page ""
    And A User Select Phone type as in Adjuster page
    And A User Enter phone Number in Adjuster page ""
    When A User click Create Adjuster Button
    Then A User should verify Adjuster has been created pop-up
    And A User click confirm button on pop-up


  #@updateAdjuster
 # Scenario: To Verify A User can be able to update an Adjuster from Adjuster menu.
   And A User clicks Adjuster menu
   Then A User verify All Adjuster label
    Given A User search an adjuster
    And A User update A Payroll id ""
     And A User update Associated id ""
    And A User update Bank Threshold ""
    Then A User update A DOB date
    And A User update A Tax Id ""
    And A User update A Notification Email ""
    #Then A User select Test group
    And A User update Address type as Business
    And A User update An Address1 on adjuster page " "
    And A User update a Zipcode on adjuster page " "
    And A User update a City on adjuster page   ""
    And A User update a State on adjuster page " "
    And A User update Email Type dropdown in Adjuster page
    And A User update Email id in Adjuster page ""
    And A User update Phone type as in Adjuster page
    And A User update phone Number in Adjuster page ""
    When A User click update Adjuster Button
    Then A User should verify Adjuster has been Updated pop-up
    And A User click ok button on updated pop-up

    
    Examples: 
      | Browser |
      | chrome |
      