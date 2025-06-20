package stepdefinition;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import utilities.BaseClass;
import utilities.ScreenshotUtil;

public class Hooks {

    WebDriver driver = BaseClass.driver;

    @After
    public void tearDown(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            String screenshotPath = ScreenshotUtil.takeScreenshot(driver, scenario.getName());

            // Attach screenshot to Extent report
            ExtentCucumberAdapter.addTestStepLog("Scenario Failed - Screenshot attached below:");
            ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(screenshotPath);
        }
    }
}


/*package stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import utilities.ScreenshotUtil;
import utilities.BaseClass;

public class Hooks {

    WebDriver driver = BaseClass.driver;

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            String screenshotPath = ScreenshotUtil.takeScreenshot(driver, scenario.getName());
            System.out.println("Screenshot captured at: " + screenshotPath);
        }
    }
}*/