package Locators;

import Utility.Constants;
import Utility.Functions;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


import static Utility.Functions.print;

public class Create_Proposal {

    public static AndroidDriver driver;

    public Create_Proposal(AndroidDriver driver) {
        Create_Proposal.driver = driver;
    }

    By start_proposal = By.xpath("//*[@content-desc='Let’s get you started']"); // Xpath for to click and select the project type
    By select_project = By.xpath("//*[@content-desc='Rooms']"); // xpath for project type
    By next_button = By.xpath("//*[@text='Next']"); // Xpath for next button\
    By select_room = By.xpath("//*[text='Select number of rooms']"); // Xpath to select the rooms
    By number_of_rooms = By.xpath("//*[@content-desc='3']"); // Xpath to select number
    By select_room_size = By.xpath("//*[text='Select Room Size']"); //Xpath to select room size
    By select_room_amount = By.xpath("//*[@text='21 - 25 m²']");
    By renovation_scope = By.xpath("//*[@text='Demolition']"); // Xpath to select scope
    By startdate = By.xpath("//*[@text='Planned start date']"); // Xpath to select the start date
    By post_button = By.xpath("//*[@text='Post']");



    public void Start_proposal(){
        print("********Checking For Select Project Type*********");
        if(start_proposal!=null){
            try{
                Functions.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget" +
                        ".ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")).click();
                print("The User was Successfully Click On The Start Proposal Button");
                Functions.simpleWait(Constants.wait_2);
            }catch (Exception e){
                e.printStackTrace();
                print("***************Test Case Fail**********");
                print("The user was not able to click on the: "+ start_proposal);
            }
        }

        print("********Checking To Select The Project Type************");
        if (select_project!=null){
            try{
                Functions.driver.findElement(select_project).click();
                print("The user was abel to select the project type");
                Functions.simpleWait(Constants.wait_2);
                Functions.driver.findElement(next_button).click();
                Functions.simpleWait(Constants.wait_1);
            }catch (Exception e){
                print("***************Test Case Fail**********");
                print("The user was not able to click on the: "+ select_project + " and "+ next_button);
            }
        }

        print("**********Checking To Select The Number Of Rooms************");
        if (select_room!=null){
            try{
                Functions.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/" +
                        "android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText")).click();
                Functions.simpleWait(Constants.wait_2);
                Functions.driver.findElement(number_of_rooms).click();
                Functions.simpleWait(Constants.wait_2);
                Functions.driver.findElement(next_button).click();
                Functions.simpleWait(Constants.wait_1);
                print("The user was successfully select the number's of room");
            }catch (Exception e){
                print("***************Test Case Fail**********");
                print("The user was not able to click on the: "+ select_room + " and "+ number_of_rooms);
            }
        }

        print("********Checking To Select The Room Size*********");
        if (select_room_size!=null){
            try{
                try {
                    WebElement dropdownArrow1 = Functions.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView"));
                    dropdownArrow1.click();
                    Functions.simpleWait(Constants.wait_2);
                    WebElement Room_1 = Functions.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup"));
                    Room_1.click();
                    Functions.simpleWait(Constants.wait_2);

                    WebElement dropdownArrow2 = Functions.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView"));
                    dropdownArrow2.click();
                    Functions.simpleWait(Constants.wait_2);
                    WebElement Room_2 = Functions.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup"));
                    Room_2.click();
                    Functions.simpleWait(Constants.wait_2);

                    WebElement dropdownArrow3 =Functions.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView"));
                    dropdownArrow3.click();
                    Functions.simpleWait(Constants.wait_2);
                    WebElement Room_3 = Functions.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup"));
                    Room_3.click();
                }catch (Exception e){
                    print("Test Case Fail\nSelect room flow break");
                    e.printStackTrace();
                }
                Functions.simpleWait(Constants.wait_2);
                Functions.driver.findElement(next_button).click();
                Functions.simpleWait(Constants.wait_1);
                print("The user was successfully select the room size");
            }catch (Exception e){
                print("***************Test Case Fail**********");
                print("The user not able to click on the: "+ select_room_size + " and "+select_room_amount);
            }
        }

        print("********Checking For Renovation Scope***********");
        if (renovation_scope!=null){
            try{
                Functions.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/" +
                        "android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.Button")).click();
                Functions.simpleWait(Constants.wait_2);
                Functions.driver.findElement(next_button).click();
                print("The user was successfully select the room renovation scope");
            }catch (Exception e){
                print("***************Test Case Fail**********");
                print("The user was not able to select the: "+renovation_scope);
            }
        }
        Functions.simpleWait(Constants.wait_2);
        //select the project start and end date
        if (startdate != null) {
            try {
                WebElement date = Functions.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.TextView"));
                date.click();
                Functions.simpleWait(Constants.wait_2);
                Functions.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout" +
                        "/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")).click();
                print("The user was successfully select the project start date");
            } catch (Exception e) {
                print("*********Test Case Fail**********");
                print("The User Was Not Able To Select The Project Start Date");
            }
            Functions.simpleWait(Constants.wait_2);
            try {
                Functions.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/" +
                        "android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[7]")).click();
                Functions.simpleWait(Constants.wait_2);
                Functions.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")).click();
                print("The User was successfully select the project end date");
                Functions.simpleWait(Constants.wait_2);
                Functions.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android." +
                        "view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup[2]/android.widget.TextView")).click();
            } catch (Exception e) {
                print("*********Test Case Fail**********");
                print("The User Was Not Able To Select The Project End Date");
            }
        }
        // Image upload screen Next button
        Functions.simpleWait(Constants.wait_3);
        try {
            Functions.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
                    "FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/" +
                    "android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup[2]")).click();
        }catch (Exception e){
            print("*********Test Case Fail**********");
            print("The User Was Not Able To Click On The Next Button Comes On the Project Image Selection Screen");
        }

        // Project description screen and Project Location screen
        Functions.simpleWait(Constants.wait_2);
        try{
            Functions.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget" +
                    ".FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android." +
                    "view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[2]")).sendKeys("Test Project");
            print("The user successfully give the project description");
            Functions.simpleWait(Constants.wait_2);
            Functions.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget." +
                    "LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android" +
                    ".view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText")).sendKeys("Dubai");
            print("The User successfully give the project location");
            Functions.simpleWait(Constants.wait_2);
            Functions.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget" +
                    ".LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup" +
                    "/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]")).click();

        }catch (Exception e){
            print("*********Test Case Fail**********");
            print("The User Was Not Able To Give Project Description And Project Location");
        }

        print("**********Check For The Project Details And Project Post Button");
        Functions.simpleWait(Constants.wait_2);
            try{
                Functions.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout" +
                        "/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup" +
                        "/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup[2]")).click();
                print("The user was successfully click on the project button: "+ post_button);
            }catch (Exception e){
                print("**********Test Case Fail*************");
                print("The User was not able to click on the project post button: "+ post_button);
            }
        WebDriverWait wait = new WebDriverWait(Functions.driver, Duration.ofSeconds(20));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//*[@text='Congratulations!']")));
        // Check if the element is displayed
        if (element.isDisplayed()) {
            print("Element is visible." + element);
            print("The Project is successfully Created");
        } else {
            print("Element is not visible.");
        }

        print("***********Checking For View All Project Button******************");
        try {
            Functions.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget" +
                    ".FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view" +
                    ".ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")).click();
            print("The user was successfully click on the view all project button");
        }catch (Exception e){
            print("**********Test Case Fail*************");
            print("The user was not able to click on the view all project button");
        }




    }
}
