package com.cydeo.step_definitions;
import com.cydeo.pages.DropdownsPage;
import com.cydeo.utlities.BrowserUtils;
import com.cydeo.utlities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class DataTables_StepDefinitions{

    @When("User should see below list")
    public void user_should_see_below_list(List<String> fruitsAndVegetables) {
        System.out.println("fruitsAndVegetables = " + fruitsAndVegetables);

        System.out.println(fruitsAndVegetables.get(1));
    }
    @When("I will share my favorites")
    public void i_will_share_my_favorites(List<String> listOfPets){

        System.out.println("listOfPets = " + listOfPets);
    }

    @Then("officer is able to see any data he wants")
    public void officer_is_able_to_see_any_data_he_wants(Map<String, String> driveInfo) {

        System.out.println("driveInfo.get(\"name\") = " + driveInfo.get("name"));
        System.out.println("driveInfo.get(\"address\") = " + driveInfo.get("address"));
        System.out.println("driveInfo.size() = " + driveInfo.size());


    }

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }
    DropdownsPage dropdownsPage = new DropdownsPage();
    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedMonth) {

        List<String> actualMonths = BrowserUtils.dropdownsOptions_as_String(dropdownsPage.monthDropdown);

        Assert.assertEquals(expectedMonth, actualMonths);
    }



}
