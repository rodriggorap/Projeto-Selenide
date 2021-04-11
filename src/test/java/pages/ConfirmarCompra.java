package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;
import org.openqa.selenium.By;

public class ConfirmarCompra {
    private SelenideElement btnConfirmaCompra  = $(byText("I confirm my order"));


    public SelenideElement getBtnConfirmaCompra() {
        return btnConfirmaCompra;
    }

    public void setBtnConfirmaCompra(SelenideElement btnConfirmaCompra) {
        this.btnConfirmaCompra = btnConfirmaCompra;
    }

    public void confirmarCompra() {

        btnConfirmaCompra.click();
    }
}
