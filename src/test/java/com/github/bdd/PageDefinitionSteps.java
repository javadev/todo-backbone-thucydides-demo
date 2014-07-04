package com.github.bdd;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.Keys;

public class PageDefinitionSteps {

    @Given("the user is on the ToDo login page")
    public void givenTheUserIsOnToDoLoginPage() {
    }

    @When("the user enters his credentials '$login' and '$password'")
    public void whenUserEntersHisCredentials(String login, String password) {
    }

    @Then("he should see the dashboard")
    public void thenHeShouldSeeTheDashboard() {
    }
}
