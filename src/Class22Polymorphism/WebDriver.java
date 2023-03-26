package Class22Polymorphism;

public class WebDriver {

    public void startBrowser(){//method
        System.out.println("Starting the browser");
    }

    public void openURL(){//method
        System.out.println("Opening a URL");
    }
    public void testLoginPage(){
        System.out.println("Checking if login page works");
    }

    public void closeBrowser(){
        System.out.println("Closing the browser");
    }
}

//the lines below are already writting by Selenium guys and we don't need to overlad

//here we create another class (Chrome) and then overload all the methods(behaveiours)from parent class
class Chrome extends WebDriver{
    //here we override

    @Override
    public void startBrowser() {

        System.out.println("Starting Google Chrome");
    }

    @Override
    public void openURL() {

        System.out.println("Opening the URL in google Chrome");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the Login page in Chrome");
    }

    @Override
    public void closeBrowser() {

        System.out.println("Closing the Chrome browser");
    }
}



//again create the class SAFRI and overload all the methods that we have in parent class(WebDriver)

class Safari extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Staring the Safari ");
    }

    @Override
    public void openURL() {
        System.out.println("Opening the URL on Safari");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the URL on Safari");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Safari");
    }
}

//here creating another class FireForx

class FireFox extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Opening  the FireFox");
    }

    @Override
    public void openURL() {
        System.out.println("Opening the URL on FireFox");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login Page in FireFox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the FireFox");
    }
}