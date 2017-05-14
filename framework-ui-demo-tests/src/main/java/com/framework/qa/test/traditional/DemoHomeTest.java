package com.framework.qa.test.traditional;

import com.framework.qa.ui.pages.PuppyHomePage;
import com.framework.qa.uicore.test.TestBase;
import com.framework.qa.utils.exception.FrameworkException;
import org.testng.annotations.Test;

public class DemoHomeTest extends TestBase{

    @Test(groups = {"BAT"})
    public void test_Verify_The_Puppy_Home() throws FrameworkException {
        new PuppyHomePage(getDriver()).
                step_Click_Puppy_View().
                step_Return_To_List_Page().
                validate_Page_Header_Title("Sally\'s Puppy Adoption Agency.");
    }

    @Test(groups = {"BAT"})
    public void test_Verify_The_Puppy_Checkout() throws FrameworkException {
        new PuppyHomePage(getDriver()).
                step_Click_Puppy_View().
                step_Click_AdoptMe_Button().
                step_Click_Complete_Flow_Button().
                step_Fill_Registration_Details("Rashmi","17, Pannipitiya","deathrush@gmail.com", "Credit card").
                step_Submit_Order();
    }

    @Test(groups = {"BAT"})
    public void test_Verify_Click_View_Element() throws FrameworkException {
        new PuppyHomePage(getDriver()).
                step_Click_Puppy_View();
    }
}