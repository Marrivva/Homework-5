
import com.codeborne.selenide.SelenideElement;
import org.example.utils.ChromeRunner;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.by;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;

public class Assets extends ChromeRunner {

    @Test
    public void BTCPrice(){
        open("assets");
        SelenideElement BTCRow = $(by("data-assetid", "btc"));
        BTCRow.click();
        SelenideElement Price = $("#assetBuyPrice");
        String buyPrice = $(Price).getText();

        System.out.println("BTC Buy Price = " + buyPrice);

    }
}
