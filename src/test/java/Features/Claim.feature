#Author:  Ajithkumar.Soundararajan@aroopatech.com
@Claim
Feature: To Ensure A Claim Functionality

  Background: 
    Given A User launch the chrome "Chrome" Browser,
    And A User Navigate to the Url "",
    And A User enter the Username "",
    And A User enter the Password "",
    And A User clicks Login Button.
    When A User click A Claim menu
  Scenario: A User should be able to create a claim.
   
    Then A User click Add Claim Button
    And A User select client Name
    Given A User Enter A claim Number
    Given A User Enter A Policy Number
    When A User click create button
    And A User Verify A RyzeFile number
    Given A User Enter Insured First Name
    And A User Enter Insured Last Name
    Given A User Enter Loss Address line1
    And A User Enter Loss Address line2
    Given A User Enter Zip code
    And A User Select Primary Phone number Type
    Given A User Enter Primary Phone number
    And A User Select Secondary Phone number Type
    Given A User Enter Secondary Phone number
    And A User Enter E-mail Id
  
    Then A User select Adjuster Name
    And A User Assignment type
    Given A User Select Examiner
    And A User Select TPA Reviewer
    Then A User Select Client Adjuster.
    When A User Clicks Update claim button.
    Then A User Should Verify Claim updated Pop-up.
    
   @closedclaim 
    Scenario: A User try to Close a Claim
    Given A User click  AdvanceFilter Button,
    And A User Enter Ryzefile number,
    When A User click Search button,
    Then A User Should Verify RyzeFile number,
    And A User clicks Close claim button,
    When A User clicks Save button.
    Then A User Should verify Wheather Claim is closed or not?
     
    @ReopenClaim
    Scenario: A User try to Reopen claim
    And A User clicks Reopen button
    Then A User select Reopen reason and Sub reason
    When A User clicks Save button in A pop-up.
    
    
    
