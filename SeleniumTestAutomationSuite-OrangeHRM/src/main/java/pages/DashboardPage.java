package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class DashboardPage {
    WebDriver driver;
    WebDriverWait wait;

    By pimMenu = By.xpath("//span[text()='PIM']");
    By logoutDropdown = By.className("oxd-userdropdown-tab");
    By logoutBtn = By.xpath("//a[text()='Logout']");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void clickPIM() {
        wait.until(ExpectedConditions.elementToBeClickable(pimMenu)).click();
    }

    public void logout() {
        wait.until(ExpectedConditions.elementToBeClickable(logoutDropdown)).click();
        wait.until(ExpectedConditions.elementToBeClickable(logoutBtn)).click();
    }
}

