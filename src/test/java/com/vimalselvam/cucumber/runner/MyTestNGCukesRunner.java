package com.vimalselvam.cucumber.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;

import java.io.File;

@CucumberOptions(
        features = {"src/test/resources/features/MySecondFeature.feature"},
        glue = {"com.vimalselvam.cucumber.stepdefinitions"},
        plugin = {"pretty"}
)
public class MyTestNGCukesRunner{
    
    }

