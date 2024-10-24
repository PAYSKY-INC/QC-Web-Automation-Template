package io.paysky.qc;

import io.paysky.qc.pages.*;
import io.paysky.qc.pages.Logout.Logout;
import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.testng.Tag;
import org.testng.annotations.AfterTest;

public class Login {

    final OnboardingPage onboardingPage = new OnboardingPage();
    final Logout logoutPage = new Logout();

    @org.testng.annotations.Test(priority = 1)
    @Description("Test")
    @Link("https://devops.paysky.io/DefaultCollection/Infinity/_workitems/edit/62811")
    @Owner("Mohamed Ehab")
    @Tag("End-To-End")

    public void LoginWithMerchant() throws Exception {
        onboardingPage.setUp();
    }

    @AfterTest
    public void CloseDriver() throws InterruptedException {
        logoutPage.Close_driver();
    }
}
