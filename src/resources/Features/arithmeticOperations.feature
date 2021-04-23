# new feature
# Tags: optional
@arithmetic
Feature: Arithmrtic operations

  @sum
  Scenario: sum of two numbers
    Given numbers are 10 and 20
    When add numbers
    Then verify sum is 30

  @sum_outline
  Scenario Outline: Add two number
    Given I have a calculator
    When I add <num1> and <num2>
    Then the result should be <total>

    Examples:
      | num1 | num2 | total |
      | -2   | 3    | 1     |
      | 10   | 15   | 25    |
      | 99   | -99  | 0     |
      | -1   | -10  | -11   |


  @substraction
  Scenario: substraction of two numbers
    Given numbers are
      | 20 |
      | 5  |
    When substract  two numbers
    Then verify result is
      | 15 |

  @multiplication
  Scenario: multiplication of two numbers
    Given multiply numbers are
      | 20 |
      | 5  |
    When multiply  two numbers
    Then verify result is 100
