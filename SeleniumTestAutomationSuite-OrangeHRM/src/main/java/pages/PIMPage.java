package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class PIMPage {
    WebDriver driver;
    WebDriverWait wait;

    By addBtn = By.xpath("//button[text()=' Add ']");
    By firstName = By.name("firstName");
    By lastName = By.name("lastName");
    By saveBtn = By.xpath("//button[@type='submit']");
    By searchName = By.xpath("(//input[@placeholder='Type for hints...'])[1]");
    By searchBtn = By.xpath("//button[text()=' Search ']");
    By deleteIcon = By.xpath("//i[@class='oxd-icon bi-trash']");
    By confirmDelete = By.xpath("//button[text()=' Yes, Delete ']");

    public PIMPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void addEmployee(String fName, String lName) {
        wait.until(ExpectedConditions.elementToBeClickable(addBtn)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstName)).sendKeys(fName);
        wait.until(ExpectedConditions.visibilityOfElementLocated(lastName)).sendKeys(lName);
        wait.until(ExpectedConditions.elementToBeClickable(saveBtn)).click();
    }

    public void searchEmployee(String name) {
        WebElement nameField = wait.until(ExpectedConditions.visibilityOfElementLocated(searchName));
        nameField.clear();
        nameField.sendKeys(name);
        wait.until(ExpectedConditions.elementToBeClickable(searchBtn)).click();
    }

    public void deleteFirstResult() {
        wait.until(ExpectedConditions.elementToBeClickable(deleteIcon)).click();
        wait.until(ExpectedConditions.elementToBeClickable(confirmDelete)).click();
    }
}
