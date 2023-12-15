#Author:  Ajithkumar.Soundararajan@aroopatech.com
@Entity
Feature: An Entity Functionality

  Background:
    Given A User launch the "chrome" Browser
    And A User Navigate the Url ""
    And A User Enter valid UserName ""
    And A User Enter Valid Password ""
    And A User click the login Button
    Then A User Verify logined Successfully
    And A User clicks Entity menu
    Then A User verify All Entities label

  @create
  Scenario: To Verify A User can be able to create a client from an Entity.
    And A User clicks Entity menu
    Then A User verify All Entities label
    And A User clicks Add Entities button
    Then A User verify Create Entities label
    And A User select Entity type dropdown As Company""
    And A User Enter Company name ""
    And A User Select A Role dropdown As Client
    And A User Enter First Report Due Days ""
    And A User Enter Second Report Due Days ""
    And A User Enter Follow up Report Due Days ""
    And A User Enter Dob/inc
    And A User Enter Tax ID ""
    And A User Enter Notification Email Id ""
    And A User Select Client-Group dropdown
    And A User click Test Group CheckBox
    #And A User Select Reports
    And A User Select Email Type dropdown As Office
    And A User Enter Email id ""
    And A User Select Phone type as office
    And A User Enter phone Number ""
    And A User Select Address type dropdown As Residential
    And A User Enter An Address ""
    And A User Enter Zip code ""
    And A User Enter City  ""
    And A User Enter State  ""
    When A User click Create Entities Button
    Then A User should verify Entity has been created pop-up
    #And A User click ok button on pop-up

  @update
  Scenario: To Verify A User can be able to update client from An entity
    And A User search an Entity As ""
    And A User clicks ShowClaimContacts Box
    Then A User verify a Entity
    And A User update first report due day ""
    And A User update second report due day ""
    And A User update follow up report due day ""
    And A User update client group dropdown
    And A User update Tax Id ""
    And A User update Notification Email ""
    And A User update Additional Address As office
    And A User update Additional Addrees1  ""
    And A User update Additional Zipcode   ""
    And A User update Additional city  ""
    And A User update Additional state "" 
    And A User update Additional Email type dropdown as business
    And A User update Additional Email id ""
    And A User update Additional Phone type dropdown as mobile
    And A User update Additional Phone type ""
    And A User click update button
    Then A User should verify Entitty has been updated pop-up
    And A User click Confirmation on pop-up
 