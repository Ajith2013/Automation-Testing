#Author: Ajithkumar.Soundararajan@aroopatech.com
@Invoice
Feature: To Ensure An Invoice Functionality

  Background: 
    Given User launch the chrome "Chrome" Browser,
    And User Navigate to the Url "",
    And User enter the Username "",
    And User enter the Password "",
    And User clicks Login Button.
    When User click A Claim menu
@CreateInvoice
  Scenario: User try to create an invoice
    Then User click Add Claim Button
    And User select client Name.
    Given User Enter A claim Number.
    Given User Enter A Policy Number.
    When User click create button.
    And User Verify A RyzeFile number.
    Given User Enter Insured First Name.
    And User Enter Insured Last Name.
    Given User Enter Loss Address line1.
    And User Enter Loss Address line2.
    Given User Enter Zip code.
    And User Select Primary Phone number Type.
    Given User Enter Primary Phone number.
    And User Enter E-mail Id.
    Then User select Adjuster Name.
    And User Assignment type.
    Given User Select Examiner.
    And User Select TPA Reviewer.
    Then User Select Client Adjuster..
    When User Clicks Update claim button..
    Then User Should Verify Claim updated Pop-up..
    And User clicks Invoice Tab..
    When User click Add invoice button..
    And User select Product item.
    Then User Enter A Quantity.
    And User Enter A Cost.
    When User Clicks create invoice button.
    Then User should be verify Invoice created Successfully!
@ReviewInvoice
  Scenario: Reviewing an Invoice
    Given the User navigates to the Invoice tab
    When the User clicks on an invoice
    And the User clicks the Review button
    And the User selects the QuickBooks (QB) class
    Then the User should verify if the invoice is reviewed
@ApproveInvoice
  Scenario: Approving an Invoice
    Given the User navigates to the Invoice & Billing tab 
    Then the User clicks on a specific invoice
    And the User clicks the Approve button
    And the User selects QB class
    Then the User should verify if the invoice is approved
