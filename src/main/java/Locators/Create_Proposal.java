package Locators;

import Utility.Constants;
import Utility.Functions;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;

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
                Functions.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/" +
                        "android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText")).click();
                Functions.simpleWait(Constants.wait_2);
                Functions.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view." +
                        "ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup")).click();
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
                Functions.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.wid" +
                        "get.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")).click();
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
                Functions.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android." +
                        "widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")).click();
                print("The User was successfully select the project end date");
                Functions.simpleWait(Constants.wait_2);
                Functions.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android." +
                        "view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup[2]/android.widget.TextView")).click();
            } catch (Exception e) {
                print("*********Test Case Fail**********");
                print("The User Was Not Able To Select The Project End Date");
            }

        }
    }
}
