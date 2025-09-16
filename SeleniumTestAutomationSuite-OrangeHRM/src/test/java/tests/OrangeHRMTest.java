package tests;

import org.testng.annotations.Test;
import pages.*;
import base.BaseTest;

public class OrangeHRMTest extends BaseTest {

    @Test(priority = 1)
    public void loginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123");
    }

    @Test(priority = 2, dependsOnMethods = {"loginTest"})
    public void addEmployeeTest() {
        DashboardPage dashboard = new DashboardPage(driver);
        dashboard.clickPIM();

        PIMPage pim = new PIMPage(driver);
        pim.addEmployee("John", "Doe");
    }

    @Test(priority = 3, dependsOnMethods = {"addEmployeeTest"})
    public void searchAndDeleteEmployeeTest() {
        DashboardPage dashboard = new DashboardPage(driver);
        dashboard.clickPIM();

        PIMPage pim = new PIMPage(driver);
        pim.searchEmployee("John");

        // Add a small wait here if necessary
        try { Thread.sleep(1000); } catch (InterruptedException e) {}

        pim.deleteFirstResult();
    }

    @Test(priority = 4, dependsOnMethods = {"searchAndDeleteEmployeeTest"})
    public void logoutTest() {
        DashboardPage dashboard = new DashboardPage(driver);
        dashboard.logout();
    }
}

