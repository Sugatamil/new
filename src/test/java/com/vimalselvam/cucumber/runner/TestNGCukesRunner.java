package com.vimalselvam.cucumber.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/zomato.feature"},
        glue = {"com.stepdefinition"},
        plugin = {"pretty","html:target/cucumber-html-report"}, monochrome = true
       // tags= {"@flipcartlogin"}
)
public class TestNGCukesRunner extends AbstractTestNGCucumberTests {
       }

