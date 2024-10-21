package Utility;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Functions {
    public static AndroidDriver driver;
    static DesiredCapabilities caps;
    public  Functions(AndroidDriver driver) {
    }

    public static void MyCapabilities() throws MalformedURLException {
        // **************These_Are_Mobile_Capabilities************
        caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("version", "14.0");
        caps.setCapability("deviceName", "2C191FDH20027V");
        caps.setCapability("appPackage", "com.renohome");
        caps.setCapability("appActivity", "com.renohome.MainActivity");
        caps.setCapability("noReset", true);
        System.out.println("These_Are_MyMobileCapabilities  --> " +caps);


        // ******To_Connect_With_Appium_Server
        URL url = new URL("http://localhost:4723/wd/hub");
        System.out.println("Appium_Server_URL  --> " + url);
        driver = new AndroidDriver(url, caps);
        System.out.println("Reno_Application_Launch_Successfully");
    }


    // *******To_Provide_Wait************
    public static void simpleWait(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // **********To_Provide_Print**********
    public static void print (String val)
    {
        System.out.println(val);
    }

}
