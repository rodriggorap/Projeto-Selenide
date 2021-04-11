package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class ResultadoBusca {

    public void escolherProduto(String produto) {
        $(By.linkText(produto)).click();
    }
}
