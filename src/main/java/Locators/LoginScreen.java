package Locators;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import static Utility.Functions.print;
import Utility.Constants;
import Utility.Functions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LoginScreen {
    public static AndroidDriver driver;

    public LoginScreen(AndroidDriver driver) {
        LoginScreen.driver = driver;
    }

    By Allow_button = By.xpath("//*[@text='While using the app']");  // xpath for permission button
    By signUp = By.xpath("//*[@text='Sign Up']");  // xpath for signup button on login screen
    By email = By.xpath("//*[@text='Email Address']");  // xpath for email box
    By password = By.xpath("//*[@text='Password (8 or more characters)']"); // xpath for password filed


    // For Allow Popup Access Method
    public void allow_Button() {
        print("********Checking For Access Popup*********");
        if (Allow_button != null) {
            try {
                Functions.driver.findElement(Allow_button).click();
                print("The User Was Successfully Click On The Allow  Button");
                Functions.simpleWait(Constants.wait_2);
            } catch (Exception e) {
                print("*********Test Case Fail**********");
                print("The User Was Not Able To Click On The Allow Button");
            }
        }
    }

    // When user click on the signup button
    public void login() {
        print("********Checking For Login Button*********");
        if (signUp != null) {
            try {
                Functions.driver.findElement(signUp).click();
                print("The User Was Successfully Click On The Sign-Up Button");
            } catch (Exception e) {
                print("*********Test Case Fail**********");
                print("The User Was Not Able To Click On The Sign-Up Button");
            }
        }
        Functions.simpleWait(Constants.wait_2);
        // When user click on the login button
        try {
            Functions.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
                    "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android." +
                    "view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[9]/" +
                    "android.widget.TextView")).click();
            print("The User Was Successfully Click On the Login Button");
            Functions.simpleWait(Constants.wait_2);
        } catch (Exception e) {
            print("*********Test Case Fail**********");
            print("The User Was Not Able To Click On The Login Button");
        }
        // When user give Email ID
        if (email != null) {
            try {
                Functions.driver.findElement(email).sendKeys(Constants.Email);
                print("The User was Successfully Give The Email ID");
                Functions.simpleWait(Constants.wait_2);
            } catch (Exception e) {
                print("*********Test Case Fail**********");
                print("The User Was Not Able To Give Email ID");
            }
        }
        // When user give Password
        if (password != null) {
            try {
                Functions.driver.findElement(password).sendKeys(Constants.Password);
                print("The User was Successfully Give The Password");
                Functions.simpleWait(Constants.wait_2);
            } catch (Exception e) {
                print("*********Test Case Fail**********");
                print("The User Was Not Able To Give Password");
            }
        }
        // When user click on the app login button
        try {
            Functions.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout" +
                    "/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView" +
                    "/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.TextView")).click();
            print("The user was Successfully click on the App Login button");
            Functions.simpleWait(Constants.wait_2);
        } catch (Exception e) {
            print("*********Test Case Fail**********");
            print("The User Was Not Able To Click On The App Login Button");
        }
        Functions.simpleWait(Constants.wait_2);


    }
}
