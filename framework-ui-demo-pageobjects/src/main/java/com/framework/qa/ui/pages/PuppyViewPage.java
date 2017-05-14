package com.framework.qa.ui.pages;

import com.framework.qa.uicore.page.BasicPage;
import com.framework.qa.utils.exception.ApplicationException;
import com.framework.qa.utils.exception.FrameworkException;
import com.framework.qa.utils.exception.ScriptException;
import com.framework.qa.webelementcore.element.Button;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * PuppyViewPage.java - PuppyViewPage page related elements and behaviours
 *
 * @author Rashmi Shashindra
 * @version 1.0-SNAPSHOT Last modified 01_15_2017
 * @since 12/08/2016.
 */
public class PuppyViewPage extends BasicPage{

    final static Logger log = Logger.getLogger(PuppyViewPage.class);

    private Button adoptMeButton;
    private Button backToList;

    /**
     * Initiate - Page components
     * @param driver driver instance
     */
    public PuppyViewPage(RemoteWebDriver driver) throws FrameworkException {
        super(driver);
        initializeElements(this);
        //PageFactory.initElements(driver, this);
        log.info("Initiate " + this.getClass().getName());
    }

    /**
     * Step - Move back to puppies list page by click 'return to list' link
     * @return PuppyHomePage
     */
    public PuppyHomePage step_Return_To_List_Page() throws FrameworkException {
        test_step_initiation();
        log.info("Click Return To List Icon");
        return new PuppyHomePage(this.driver);
    }

    /**
     * Step - Move forward to puppies adopme page by click 'adopt me' link
     * @return PuppyAdoptPage
     */
    public PuppyAdoptPage step_Click_AdoptMe_Button() throws FrameworkException {
        test_step_initiation();
        adoptMeButton.click();
        log.info("Click AdoptMe Button");
        return new PuppyAdoptPage(this.driver);
    }
}
