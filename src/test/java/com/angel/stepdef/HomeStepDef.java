package com.angel.stepdef;

import com.angel.BaseTest;
import com.angel.page.HomePage;

public class HomeStepDef extends BaseTest {

    HomePage homePage;

    public void userIsOnHomepage()  {
        homePage = new HomePage(driver);
        homePage.validateOnHomePage();
    }
}