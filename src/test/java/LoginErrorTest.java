import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.example.utils.ChromeRunner;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static org.testng.Assert.assertTrue;

public class LoginErrorTest extends ChromeRunner {

    @Test
    public void invalidLoginShowsErrorMessage() {
        open("login");

        $("#Email").shouldBe(visible).setValue("wrongmail@gmial.com");

        String Password = "incorrectPass";
        SelenideElement PasswordInput = $("#Password").shouldBe(visible).setValue(Password);

        $("button[class=\"btn bg-green-200 text-white rounded-1 w-100\"]").click();

        Assert.assertNotEquals(PasswordInput.getValue(), Password, "password validation");
        Assert.assertTrue(PasswordInput.is(Condition.empty));
    }
}
