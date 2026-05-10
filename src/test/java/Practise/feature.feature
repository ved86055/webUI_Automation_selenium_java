Fearure: Login Functionality

  Scenario:User Logs in with valid credentials

   Given User is on Country Delight Delivery Server Login page
   When User enters valid "<Username>" Username and "<Password>" Password
   Then User should be logged in successfully
   and User should See text of "Welcome <Username>" Message

  Examples :
      |Username|Password|
      |ved     |veds    |
      |lasved  |pos     |



Scenario : User Fails to login when Invalid Credentials Entered

  Given User is on Country Delight Delivery Server Login Page
  When User Enters invalid "<Username>" Username and valid "<Password>" Password
  Then User Login  should fail
  and Proper "<Validation message>" Validation Message  should be Shown

  Examples :
     |Username|Password     |validation message|
     |wrongabd     |def     |Invalid Username



