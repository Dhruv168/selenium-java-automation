package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By agreeBtn = By.xpath("//button[contains(text(),'I Agree')]");
    By careerMenu = By.cssSelector("a[href='/career/']");

    // Actions
    public void clickAgree() {
        driver.findElement(agreeBtn).click();
    }

    public void navigateToCareer() {
        driver.navigate().refresh();
        driver.findElement(careerMenu).click();
    }

}
