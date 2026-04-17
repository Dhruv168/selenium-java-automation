package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class CareerPage {
    WebDriver driver;

    public CareerPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By peopleTab = By.cssSelector("[data-type='people']");
    By twoInternsArticle = By.cssSelector("a[href*='life-of-two-interns']");
    By jobTab = By.cssSelector("[data-type='job']");
    By jobCVText = By.cssSelector("a .relative .h4");

    // Actions
    public void openPeopleTab() {
        driver.findElement(peopleTab).click();
    }

    public void openTwoInternArticle() {
        driver.findElement(twoInternsArticle).click();
    }

    public void scrollThroughArticle() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void goBack() {
        driver.navigate().back();
    }

    public void openJobsOpenings() {
        driver.findElement(jobTab).click();
    }

    public String getJobCVText() {
        return driver.findElement(jobCVText).getText();
    }
}