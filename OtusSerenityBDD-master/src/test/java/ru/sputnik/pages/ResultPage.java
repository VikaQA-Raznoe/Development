package ru.sputnik.pages;

import cucumber.api.java.en.Then;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static junit.framework.TestCase.assertTrue;

public class ResultPage extends PageObject {
    @FindBy(css=".b-result-list")
    WebElementFacade resultList;

    @Then("I see results page")
    public void thenISeeResultsPage(){
        assertTrue(this.compatibleWithUrl("https://www.sputnik.ru/search"));
    }

    @Then("I see result container")
    public void thenISeeResultListContainer(){
        assertTrue(resultList.isDisplayed());
    }

    @Then("I see result list")
    public void thenISeeResultList(){
        assertTrue(resultList.findElements(By.cssSelector(".b-result")).size()>0);
    }

    @Then("I see error message")
    public void thenISeeErrorMessage(){
        assertTrue($(".b-content-center .b-query").getText().contains("По вашему запросу ничего не найдено"));
    }
}
