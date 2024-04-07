package org.example.class18;

public class BrowserTester2 {

    public static void main(String[] args) {
        //Chrome chrome=new Chrome();
        //FireFox fireFox=new FireFox();
       // Safari safari=new Safari();
        Browser [] arr={new Chrome(),new FireFox(),new Safari()};

        for (int i=0;i<arr.length;i++){
            Browser b=arr[i];
            b.openBrowser();
            b.openWebsite();
            b.performTesting();
            b.closeBrowser();
        }
    }
}
