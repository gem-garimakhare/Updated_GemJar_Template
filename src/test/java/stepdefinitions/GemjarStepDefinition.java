package stepdefinitions;

import com.gemini.generic.reporting.GemTestReporter;
import com.gemini.generic.reporting.STATUS;
import com.gemini.generic.ui.utils.DriverAction;
import io.cucumber.java.an.E;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.GemjarLocators;
import org.openqa.selenium.WebElement;

import static com.gemini.generic.ui.utils.DriverAction.getElement;


public class GemjarStepDefinition {
    @Given("User is on the Demo QA app")
    public void homePage(){
        try{
            DriverAction.getTitle();
            GemTestReporter.addTestStep("Title","title of the page ", STATUS.PASS, DriverAction.takeSnapShot());
        }
        catch(Exception e){
            GemTestReporter.addTestStep("Error","Error while getting title of the page "+e, STATUS.ERR, DriverAction.takeSnapShot());
        }
    }
    @When("^User clicks on Elements$")
    public void clickElement(){
        try{
            DriverAction.scrollIntoView(GemjarLocators.element);
            DriverAction.click(GemjarLocators.element);
            GemTestReporter.addTestStep("Click Element","User clicks on Element option",STATUS.PASS,DriverAction.takeSnapShot());
        }
        catch(Exception e){
            GemTestReporter.addTestStep("Error","Error while clicking on Elements option "+e, STATUS.ERR, DriverAction.takeSnapShot());
        }
    }
    @And("User clicks on Text box")
    public void clickCheckBox(){
        try{
            DriverAction.waitUntilElementClickable(GemjarLocators.textBox,25);

            DriverAction.click(GemjarLocators.textBox);
            GemTestReporter.addTestStep("click CheckBox","User clicks on text-box", STATUS.PASS,DriverAction.takeSnapShot());
        }
        catch(Exception e){
            GemTestReporter.addTestStep("Error","Error while clicking on text-box "+e, STATUS.ERR, DriverAction.takeSnapShot());
        }
    }
    @And("User enter details in Text Box")
    public void enterDetails(){
        try{
            DriverAction.waitUntilElementAppear(GemjarLocators.fullName,10);
            DriverAction.typeText(GemjarLocators.fullName,"abc");
            DriverAction.waitUntilElementAppear(GemjarLocators.email,10);
            DriverAction.typeText(GemjarLocators.email,"abc@gmail.com");
            DriverAction.waitUntilElementAppear(GemjarLocators.currentAddress,10);
            DriverAction.typeText(GemjarLocators.currentAddress,"xyz");
            DriverAction.waitUntilElementAppear(GemjarLocators.permanentAddress,10);
            DriverAction.typeText(GemjarLocators.permanentAddress,"xyz");
            GemTestReporter.addTestStep("Enter data","Enter data in text-box ", STATUS.PASS, DriverAction.takeSnapShot());
        }
        catch(Exception e){
            GemTestReporter.addTestStep("Error","Error while clicking on entering data in text-box "+e, STATUS.ERR, DriverAction.takeSnapShot());
        }
    }
    @And("User clicks on Submit")
    public void clickSubmit(){
        try{
            DriverAction.waitUntilElementAppear(GemjarLocators.submit, 10);
            DriverAction.click(GemjarLocators.submit);
            GemTestReporter.addTestStep("Click Submit","User clicks on submit", STATUS.PASS, DriverAction.takeSnapShot());
        }
        catch(Exception e){
            GemTestReporter.addTestStep("Error","Error while clicking on submit "+e, STATUS.ERR, DriverAction.takeSnapShot());
        }
    }
    @Then("User verifies if data is submitted or not")
    public void verify(){
        try{
            WebElement verifyData = DriverAction.getElement(GemjarLocators.verifyData);
            if(verifyData.isDisplayed()){
                GemTestReporter.addTestStep("Present","Data is present ", STATUS.PASS, DriverAction.takeSnapShot());
            }
            else{
                GemTestReporter.addTestStep("Not Present","Data is not present",STATUS.PASS,DriverAction.takeSnapShot());
            }
            GemTestReporter.addTestStep("Verify data","Verifying the submitted data ", STATUS.PASS, DriverAction.takeSnapShot());
        }
        catch(Exception e){
            GemTestReporter.addTestStep("Error","Error while verifying "+e, STATUS.ERR, DriverAction.takeSnapShot());
        }
    }
}
