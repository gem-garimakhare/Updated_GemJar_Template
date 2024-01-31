package locators;

import org.openqa.selenium.By;

public class GemjarLocators {
    public static By element = By.xpath("//h5[text()='Elements']");
    public static By textBox = By.xpath("//span[text()='Text Box']");
    public static By radioButton = By.xpath("//span[text()='Radio Button']");
    public static By fullName = By.xpath("//input[@id='userName' and @class=' mr-sm-2 form-control']");
    public static By email = By.xpath("//input[@type='email']");
    public static By currentAddress = By.cssSelector("textarea[id=currentAddress]");
    public static By permanentAddress = By.cssSelector("textarea[id=permanentAddress]");
    public static By submit = By.cssSelector("button[id='submit']");
    public static By verifyData = By.xpath("//div[@class='border col-md-12 col-sm-12']");
}
