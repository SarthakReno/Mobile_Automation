package Mobile_Automation;

import Locators.Create_Proposal;
import Locators.LoginScreen;
import Utility.Functions;
import Utility.Constants;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;

public class AppTest_Login {
    public static Functions functionCall;
    public static AndroidDriver driver;
    public AppTest_Login(AndroidDriver driver) {
        AppTest_Login.driver = driver;
    }

    public static void main(String[] args) throws MalformedURLException {
        functionCall = new Functions((AndroidDriver) driver);
        LoginScreen loginScreen = new LoginScreen((AndroidDriver) driver);
        Create_Proposal createProposal = new Create_Proposal((AndroidDriver) driver);

        Functions.MyCapabilities();
        Functions.simpleWait(Constants.wait_2);
        loginScreen.allow_Button();
        Functions.simpleWait(Constants.wait_2);
        loginScreen.login();
        Functions.simpleWait(Constants.wait_2);
        createProposal.Start_proposal();



    }
}