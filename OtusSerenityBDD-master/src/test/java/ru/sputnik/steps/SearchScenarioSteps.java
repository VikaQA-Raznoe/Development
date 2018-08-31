package ru.sputnik.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ru.sputnik.pages.ResultPage;
import ru.sputnik.pages.SearchPage;

public class SearchScenarioSteps {
    SearchPage searchPage;
    ResultPage resultPage;

    @Given("I browse to sputnik.ru")
    public void givenIbrowseTo(){
        searchPage.open();
    }
    @When("I enter \"(.*)\" in search field")
    public void whenIEnterTextInSearchField(String text){
        searchPage.enterSearchPhrase(text);
    }

    @When("I click search button")
    public void whenIClickSearchButton(){
        searchPage.clickOnSubmitButton();
    }

    @Then("I see results page")
    public void thenISeeResultsPage(){
        resultPage.thenISeeResultsPage();
    }

    @Then("I see result list")
    public void thenISeeResultList(){
        resultPage.thenISeeResultList();
    }

    @Then("I see result container")
    public void thenISeeResultListContainer(){
        resultPage.thenISeeResultListContainer();
    }

    @Then("I see error message")
    public void thenIErrorMessage(){
        resultPage.thenISeeErrorMessage();
    }
}
