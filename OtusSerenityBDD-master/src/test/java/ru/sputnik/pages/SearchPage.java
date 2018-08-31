package ru.sputnik.pages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.sputnik.ru/")
public class SearchPage extends PageObject {
    @FindBy(id="js-search-input")
    WebElementFacade searchInput;
    @FindBy(css=".b-search-form__bt button[type=submit]")
    WebElementFacade searchButton;


    public void enterSearchPhrase(String text){
        searchInput.type(text);
    }
    public void clickOnSubmitButton(){
        searchButton.click();
    }


    @Given("I browse to (.*)")
    public void givenIbrowseTo(String url){


    }







}
