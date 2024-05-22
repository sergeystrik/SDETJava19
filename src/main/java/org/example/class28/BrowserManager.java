package org.example.class28;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserManager {

    static void openBrowser(String browserName){

        if(browserName.equals("Chrome")){
            ChromeDriver chromeDriver=new ChromeDriver();
        }
        else if(browserName.equals("Firefox")) {
           new FirefoxDriver();
        }else{
          //  System.out.println("Wrong browser name");
           throw new BrainNotFoundException("Brain Not Found Please contact on Mondays and Fridays");
        }
    }
}
