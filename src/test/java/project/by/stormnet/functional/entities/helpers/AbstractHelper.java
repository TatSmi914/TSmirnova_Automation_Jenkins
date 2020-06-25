package project.by.stormnet.functional.entities.helpers;

import project.by.stormnet.functional.entities.pages.AbstractPage;

public class AbstractHelper {
    static AbstractPage abstractPage = new AbstractPage();

    public static void quit(){
        abstractPage.getDriver().quit();
    }
}
