package com.github.bdd.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.core.webdriver.WebDriverFacade;

import org.fest.assertions.MapAssert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

import static org.fest.assertions.Assertions.assertThat;

import com.github.bdd.pages.TodoPage;

public class EndUserSteps extends ScenarioSteps {

    private static final Logger LOGGER = LoggerFactory.getLogger(EndUserSteps.class);

    TodoPage todoPage;

    static Integer getSystemPropertyValue(String property, Integer defValue){
        String valueStr = System.getProperty(property);
        if (valueStr != null) {
            return Integer.valueOf(valueStr);
        }
        return defValue;
    }

    @Step
    public void is_the_login_page() {

        LOGGER.info("Driver: {}", ((WebDriverFacade) getDriver()).getProxiedDriver());

        if (((WebDriverFacade)getDriver()).getProxiedDriver() instanceof PhantomJSDriver) {

            Integer width = getSystemPropertyValue("thucydides.phantomjs.browser.width", 1280);
            Integer height = getSystemPropertyValue("thucydides.phantomjs.browser.height", 768);

            getDriver().manage().window().setSize(new Dimension(width,height));
            LOGGER.info("Window size is {}x{}", width, height);
        }

        getDriver().manage().deleteAllCookies();
        todoPage.open();
    }
}
