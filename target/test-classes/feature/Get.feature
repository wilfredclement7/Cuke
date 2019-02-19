Feature: Verify the ID are retrieved
  
  Scenario: Verify the ID are retrieved
    Given I perform GET operation on "/posts/2"
    Then I check the status code to be "200"