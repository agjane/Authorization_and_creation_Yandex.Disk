package org.example;
import com.codeborne.selenide.Selenide;
import junit.framework.TestCase;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    public void test(){
        Selenide.open("https://ya.ru/");
        $x("//a[@data-statlog='headline.enter']").click();
        //ВВЕДИТЕ ВАШ ЛОГИН В ПОЛЕ SETVALUE
        $x("//input[@name='login']").setValue("логин").pressEnter();
        // ВВЕДИТЕ ВАШ ПАРОЛЬ В ПОЛЕ SETVALUE
        $x("//input[@name='passwd']").setValue("пароль").pressEnter();
        $x("//span[@class='avatar__image-wrapper']").click();
        $x("//span[text()='Диск']").click();
        switchTo().window("Яндекс.Диск");
        $x("//button[@class='Button2 Button2_view_raised Button2_size_m Button2_width_max']").click();
        $x("//span [@class='create-resource-button__text'][1]").click();
        $x("//input[@text='Новая папка']").click();
        delete();
        $x("(//input[@class=\"Textinput-Control\"])[2]").sendKeys("Цветочек");
        $x("//button [@class='Button2 Button2_view_action Button2_size_m confirmation-dialog__button confirmation-dialog__button_submit ']").click();
        Selenide.sleep(5000);
    }

    public void delete (){
        Selenide.actions().keyDown(Keys.LEFT_CONTROL).sendKeys("a").release().sendKeys(Keys.BACK_SPACE).perform();
    }

}

