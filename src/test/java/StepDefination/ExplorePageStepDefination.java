package StepDefination;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


import PageObjects.ExplorePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import utils.TestContextSetup;

public class ExplorePageStepDefination {

	TestContextSetup testContextSetup;
	ExplorePage explorepage;
	ExplorePage explorepage1;
	ExplorePage explorepage2;

	public ExplorePageStepDefination(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;

	}

	@Then("open explore link on other tab")
	public void open_explore_link_on_other_tab() throws InterruptedException {

		explorepage = testContextSetup.pageobjectmanager.getExplorePage();
		explorepage.ExploreClick();

	}

	@Then("verify the title of Explore page")
	public void verify_the_title_of_explore_page() throws InterruptedException {
		testContextSetup.commoncode.switchtochild();
		explorepage = testContextSetup.pageobjectmanager.getExplorePage();
		explorepage.verifytitle();
	}
	
	@And("^user search for issuer (.+) in bond search$")
    public void user_search_for_issuer_in_bond_search(String issuer) throws Throwable {
     explorepage=testContextSetup.pageobjectmanager.getExplorePage();
     explorepage.searchissuer(issuer);

	}
	
	@And("^user search for isin (.+) in bond search$")
    public void user_search_for_isin_in_bond_search(String isin) throws Throwable {
     explorepage=testContextSetup.pageobjectmanager.getExplorePage();
     explorepage.searchisin(isin);

	

}}
