package com.et.stepdef;
import com.et.domain.*;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class ArithmeticOperationsStepsDef {
    //addition
    int num1, num2, sum;

    @Given("^numbers are (\\d+) and (\\d+)$")
    public void numbers_aand(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }


    @When("^add numbers$")
    public void add_numbers()  {
        sum = num1 + num2;

    }

    @Then("^verify sum is (\\d+)$")
    public void verify_sum_is(int actual) {
        Assert.assertEquals(actual, sum);
    }


 //sum-2
    private int total;

    private Calculator calculator;
//optional
//    @Before
//    private void init() {
//        total = -999;
//    }

    @Given("^I have a calculator$")
    public void initializeCalculator() throws Throwable {
        calculator = new Calculator();
    }

    @When("^I add (-?\\d+) and (-?\\d+)$")
    public void testAdd(int num1, int num2) throws Throwable {
        total = calculator.add(num1, num2);
    }

    @Then("^the result should be (-?\\d+)$")
    public void validateResult(int result) throws Throwable {
        Assert.assertEquals(total, result);
        System.out.println(total+" == "+result);
    }



    //substraction
    int a, b, sub;

    @Given("^numbers are$")
    public void numbers_are(DataTable dataTable)  {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        List<Integer> list = dataTable.asList(Integer.class);
        a = list.get(0);
        b = list.get(1);
        System.out.println(a + " " + b);


    }

    @When("^substract  two numbers$")
    public void substract_two_numbers()  {
        sub = a - b;
        System.out.println(sub);
    }

    @Then("^verify result is$")
    public void verify_result_is(DataTable result)  {
        List<Integer> c = result.asList(Integer.class);
        int actual = c.get(0);
        System.out.println(actual);
        Assert.assertEquals(actual, sub);
    }

    //multiplication
    List<Double> numbers;
    double mul = 1;

    @Given("^multiply numbers are$")
    public void multiplyNumbersAre(List<Double> numbers) {
        this.numbers = numbers;

    }


    @When("^multiply  two numbers$")
    public void multiplyTwoNumbers() {
        for (Double number : numbers) {
            mul = mul * number;
        }
        System.out.println(mul);
    }

    @Then("^verify result is (\\d+)$")
    public void verifyResultIs(Double expectedTotal) {
        Assert.assertEquals(mul, expectedTotal, 0.0);
//        Assert.assertThat(mul, CoreMatchers.is(expectedTotal));

        System.out.println("Actual res : " + mul);
    }

}
