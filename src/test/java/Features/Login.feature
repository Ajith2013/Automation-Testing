#Author:  Ajithkumar.Soundararajan@aroopatech.com
@Login
Feature: Login Functionality
  @vaild_Credentails
  Scenario Outline: To Check Login Functionality with Valid Credentails
    Given User launch the "<Browser>" Browser
    And User Navigate the Url
    And User Enter valid UserName "<Username>"
    And User Enter Valid Password "<Password>"
    And User click the login Button
    Then User Verify logined Successfully

       Examples: 
      | Browser |      |  Username    |   |Password|
      | chrome  |      |cc.demo.client|   |Admin@123|
      | edge    |      |cc.demo.examiner|  |Admin@123|
      | Firefox |      |system.user|      |@Rr0P@2022|

 @Invalid_Credentails
  Scenario Outline: To Check Login Functionality with InValid Credentials
    Given A User launch the "<Browser>" Browser.
    And A User Navigate the Ryze claim Url.
    And A User Enter invalid UserName
    And A User Enter inValid Password
    And A User click the login Button.
    Then A User Verify A Error Messsage.

       Examples: 
      | Browser |
      | chrome  |
      | edge    |
      | Firefox |
      
      
      
      
