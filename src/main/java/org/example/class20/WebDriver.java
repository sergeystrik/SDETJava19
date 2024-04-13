package org.example.class20;

import java.sql.Driver;

public interface WebDriver {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();

}
class ChromeDriver implements WebDriver{
    public static void main(String[] args) {

    }

    @Override
    public void openBrowser() {
        System.out.println("Opening Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Chrome");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Chrome on Max");
    }

    @Override
    public void findElement() {
        System.out.println("finding in Chrome");
    }
}
class Tester{
    public static void main(String[] args) {
        WebDriver w=new ChromeDriver();
        w.openBrowser();
        w.closeBrowser();
        w.maximizeWindow();
        w.findElement();
    }
}
