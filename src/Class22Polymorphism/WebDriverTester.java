package Class22Polymorphism;

import java.io.CharArrayWriter;

public class WebDriverTester {

    public static void main(String[] args) {

        Chrome chrome=new Chrome();
        chrome.startBrowser();
        chrome.openURL();
        chrome.testLoginPage();
        chrome.closeBrowser();

        System.out.println("-------------------------");

        Safari safari=new Safari();
        safari.startBrowser();
        safari.openURL();
        safari.testLoginPage();
        safari.closeBrowser();

        System.out.println("-------------------------");

        FireFox fireFox=new FireFox();
        fireFox.startBrowser();
        fireFox.openURL();
        fireFox.testLoginPage();
        fireFox.closeBrowser();


        System.out.println("---second way TypeCasting------");


        //we write the parent class (Webdriver) and creating the object of Chrom
        //we also call it typeCasting becouse we are going from parent class to child class

        WebDriver webDriver=new Chrome();//here we just change the Chrome to Safari or FireFox to get the reuslt for each
       // Chrome chrome=new WebDriver(); it is downcasting and here it means we want to hold the method of child class to the parent class
        webDriver.startBrowser();
        webDriver.openURL();
        webDriver.testLoginPage();
        webDriver.closeBrowser();


        System.out.println("-----------Third way using Array and Loop-----------------");

        //we create the array of webDrive which is parent class and hold  all the objects of child classes
        //belowis the array of parent class that can hold the object of all the child classes

        // WebDriver[] browsers={Chrome,Safari,FireFox};this is another way of creating the array
        WebDriver [] browsers={new Chrome(),new Safari(), new FireFox()};//creating array and

        //below we will create the enhanceForLoop

        for (WebDriver browser:browsers){//the loop will give all the object from this loop
            browser.startBrowser();
            browser.openURL();
            browser.testLoginPage();
            browser.closeBrowser();

        }



    }
}
