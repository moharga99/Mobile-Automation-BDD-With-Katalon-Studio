@mobile @android
Feature: Login Alfagifts
  All features login Alfagifts

  @toBeAutomated
  Scenario Outline: Login With Phone Number (TC_Login_001)
    Given User is on the start page
    When User tap button Masuk
    And User tap field Phone Number or Member Card Number
    And User fill field Phone Number or Member Card Number <phoneNumber>
    And User tap field Password
    And User fill field Password <password>
    And User tap button Lanjut
    Then User enter homepage

    Examples: 
      | phoneNumber  | password |
      | 082114746495 | Abc123## |

  @toBeAutomated
  Scenario Outline: Login With Member Card Number (TC_Login_002)
    Given User is on the start page
    When User tap button Masuk
    And User tap field Phone Number or Member Card Number
    And User fill field Phone Number or Member Card Number <memberCardNumber>
    And User tap field Password
    And User fill field Password <password>
    And User tap button Lanjut
    Then User enter homepage

    Examples: 
      | memberCardNumber | password |
      | 9990011180410687 | Abc123## |

  @toBeAutomated
  Scenario Outline: Login With Member Card Number - Scan Member Card (TC_Login_003)
    Given User is on the start page
    When User tap button Masuk
    And User tap scan Member Card
    And User Scan Card
    And User tap field Password
    And User fill field Password <password>
    And User tap button Lanjut
    Then User enter homepage

    Examples: 
      | memberCardNumber | password |
      | 9990666987634444 | Abc123## |

  @toBeAutomated
  Scenario Outline: Login With Member Card Number - Scan Wrong Member Card (TC_Login_004)
    Given User is on the start page
    When User tap button Masuk
    And User tap scan Member Card
    And User Scan Card
    And User tap field Password
    And User fill field Password <password>
    And User tap button Lanjut
    Then User cant login to apps
    And User get a validation message wrong format Phone Number or Member Card Number

    Examples: 
      | memberCardNumber | password |
      |     992382292392 | Abc123## |

  @toBeAutomated
  Scenario Outline: Login with blank data (TC_Login_005)
    Given User is on the start page
    When User tap button Masuk
    And User tap button Lanjut
    Then User cant login to apps
    And User get a validation Phone Number or Member Card Number is required
    And User get a validation Password is required

    Examples: 
      | memberCardNumber | password |
      | -                | -        |

  @toBeAutomated
  Scenario Outline: Login With Wrong Format Phone Number (TC_Login_006)
    Given User is on the start page
    When User tap button Masuk
    And User tap field Phone Number or Member Card Number
    And User fill field Phone Number or Member Card Number <phoneNumber>
    And User tap field Password
    And User fill field Password <password>
    And User tap button Lanjut
    Then User cant login to apps
    And User get a validation wrong format Phone Number

    Examples: 
      | phoneNumber | password |
      |        8273 | Abc123## |

  @toBeAutomated
  Scenario Outline: Login With Wrong Format Member Card Number (TC_Login_007)
    Given User is on the start page
    When User tap button Masuk
    And User tap field Phone Number or Member Card Number
    And User fill field Phone Number or Member Card Number <memberCardNumber>
    And User tap field Password
    And User fill field Password <password>
    And User tap button Lanjut
    Then User cant login to apps
    And User get a validation message wrong format Phone Number or Member Card Number

    Examples: 
      | memberCardNumber | password |
      |          7482392 | Abc123## |

  @toBeAutomated
  Scenario Outline: Login With Wrong Format Password (TC_Login_008)
    Given User is on the start page
    When User tap button Masuk
    And User tap field Phone Number or Member Card Number
    And User fill field Phone Number or Member Card Number <phoneNumber>
    And User tap field Password
    And User fill field Password <password>
    And User tap button Lanjut
    Then User cant login to apps
    And User get a validation message wrong format password

    Examples: 
      | phoneNumber | password |
      |    14746495 | Abc123## |

  @toBeAutomated
  Scenario Outline: Login with incorrect Phone Number/Member Card Number & Password (TC_Login_009)
    Given User is on the start page
    When User tap button Masuk
    And User tap field Phone Number or Member Card Number
    And User fill field Phone Number or Member Card Number <phoneNumber>
    And User tap field Password
    And User fill field Password <password>
    And User tap button Lanjut
    Then User cant login to apps
    And User get login failed popup

    Examples: 
      | phoneNumber | password |
      |      746495 | Abc123## |

  @toBeAutomated
  Scenario Outline: Login with incorrect Phone Number/Member Card Number (TC_Login_010)
    Given User is on the start page
    When User tap button Masuk
    And User tap field Phone Number or Member Card Number
    And User fill field Phone Number or Member Card Number <phoneNumber>
    And User tap field Password
    And User fill field Password <password>
    And User tap button Lanjut
    Then User cant login to apps
    And User get login failed popup

    Examples: 
      | phoneNumber | password |
      |      746495 | Abc123## |

  @toBeAutomated
  Scenario Outline: Login with incorrect Password (TC_Login_011)
    Given User is on the start page
    When User tap button Masuk
    And User tap field Phone Number or Member Card Number
    And User fill field Phone Number or Member Card Number <phoneNumber>
    And User tap field Password
    And User fill field Password <password>
    And User tap button Lanjut
    Then User cant login to apps
    And User get a validation message incorrect password

    Examples: 
      | phoneNumber  | password |
      | 082114746495 | Abc123## |
