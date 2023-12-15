#Author:  Ajithkumar.Soundararajan@aroopatech.com
@Client
Feature: To Create A Client From Client Menu

  Background: 
    Given A User launch the chrome "Chrome" Browser
    And A User Navigate to the Url ""
    And A User enter the Username ""
    And A User enter the Password ""
    And A User clicks Login Button
    Then A User verify Logined Successfully
    And A User clicks Client menu
    Then A User verify All Client label

  Scenario: To Verify A User can be able to create a client from client menu.
    And A User clicks Add Client button
    #Then A User verify A Create client label
    And A User Enter the Company name ""
    And A User Enter A First Report due days " "
    And A User Enter A Second Report due day ""
    And A User Enter Follow Up report due days ""
    Then A User select DOB date
    And A User Enter Tax Id ""
    And A User Enter A Notification Email ""
    Then A User select Client group
    And A User check a Test Group
    And A User select Address type as Residential
    And A User Enter An Address1 " "
    And A User Enter An Address2 " "
    And A User Enter a Zipcode " "
    And A User Enter a City    " "
    And A User Enter a State "  "
    And A User Select Email Type dropdown in Client page
    And A User Enter Email id in clientpage ""
    And A User Select Phone type as in client page
    And A User Enter phone Number in client page ""
    When A User click Create Client Button
    Then A User should verify Client has been created pop-up
    

  Scenario: To verify A User can be able to create a ClientUser from User tab.
    Given A User search an Client ""
    And A User click User Tab
    And A User select Type
    Then A User select Client User
    And A User Enter A first name ""
    And A User Enter A Last name ""
    And A User Enter Email id ""
    And A User Enter Phone number ""
    When A User click save button.

  Scenario: To Verify A User can be able to Update a client from client menu.
    And A User search an Client As ""
    Then A User verify a Client
    And A User update first report due day in client page ""
    And A User update second report due day in client page ""
    And A User update follow up report due day in client page""
    And A User update client group dropdown
    And A User update Tax Id in client page""
    And A User update Notification Email in client page""
    And A User update Additional Address As office in client page
    And A User update Additional Addrees1 in client page ""
    And A User update Additional Zipcode  in client page ""
    And A User update Additional city  in client page""
    And A User update Additional state in client page""
    And A User update Additional Email type dropdown as business in client page
    And A User update Additional Email id in client page""
    And A User update Additional Phone type dropdown as mobile in client page
    And A User update Additional Phone type in client page""
    And A User click update button in client page
    Then A User should verify Entitty has been updated pop-up in client page
    And A User click Confirmation on pop-up in client page
