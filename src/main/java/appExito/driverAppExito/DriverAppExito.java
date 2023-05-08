package appExito.driverAppExito;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverAppExito {

    public static AppiumDriver<MobileElement> driver;

    public static DriverAppExito appium(){
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("noReset", "true");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "10");
            capabilities.setCapability("deviceName", "M2004J19G");
            capabilities.setCapability( "udid", "ff5dd04c0505");
            capabilities.setCapability("appPackage", "com.exito.appcompania");
            capabilities.setCapability("appActivity", "views.initialaccess.activities.SplashActivity");

            driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

        }catch (MalformedURLException e){
            e.printStackTrace();
        }
        return new DriverAppExito();
    }
    public io.appium.java_client.AppiumDriver<MobileElement> on(){return driver;}
}
