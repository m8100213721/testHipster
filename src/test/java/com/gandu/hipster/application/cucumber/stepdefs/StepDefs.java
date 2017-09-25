package com.gandu.hipster.application.cucumber.stepdefs;

import com.gandu.hipster.application.TestHipsterApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = TestHipsterApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
