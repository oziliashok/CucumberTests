package com.et.stepdef;


import cucumber.api.java.en.Given;

public class HelloStepDefs {

    @Given("welcome to cucu world")
    public void welcome_to_cucu_world() {

        System.out.println("Welcome to first cucu......example.");
    }

    @Given("^login amazon$")
    public void login_amazon() {
        System.out.println("helooo");

    }
}
