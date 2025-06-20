package utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtil {

    public static String takeScreenshot(WebDriver driver, String scenarioName) {
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String screenshotName = "screenshot_" + scenarioName.replaceAll(" ", "_") + "_" + timestamp + ".png";
        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String destination = System.getProperty("user.dir") + "/target/screenshots/" + screenshotName;
        File finalDestination = new File(destination);

        try {
            Files.createDirectories(finalDestination.getParentFile().toPath()); // ensure folder exists
            Files.copy(source.toPath(), finalDestination.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return destination; // return path if you want to attach it to reports
    }
}

