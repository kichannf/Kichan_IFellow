/**
 * Главная страница. System Dashboard
 */
package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SystemDashboardPage {

    public static final SelenideElement stepToProject = $x("//a[text()='Test (TEST)']");
    private static final SelenideElement projectButton = $x("//a[text()='Проекты']");

    public static void stepToProject() {
        projectButton.click();
        stepToProject.click();
    }

    public static void  stepToTestProject() {

    }



    //a[@href='/browse/TEST']
    //a[text()='Проекты']/following-sibling::div/a[text()='Test (TEST)']
    //a[text()='Test (TEST)'] - это верное
}