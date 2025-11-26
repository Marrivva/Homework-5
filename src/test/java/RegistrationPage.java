import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.example.utils.ChromeRunner;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.files.DownloadActions.click;

public class RegistrationPage extends ChromeRunner {


    @Test(priority = 1)
    public void Test1(){
        $(byText("რეგისტრაცია")).click();

        String email = "testmail@gmail.com";
        SelenideElement emailInput =  $(by("type", "text"));

        emailInput.setValue(email);


        Assert.assertEquals(emailInput.getValue(),email, "email validation");
        Assert.assertFalse(emailInput.is(Condition.empty));

    }


    @Test(priority = 3)
    public void Test2(){
        $(byText("რეგისტრაცია")).click();
        $(by("class", "form-check-label"), 2).click();

    }


    @Test(priority = 2)
    public void Test3(){

    }



    }