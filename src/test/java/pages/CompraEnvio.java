package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class CompraEnvio {
    SelenideElement checkTermo = $(By.id("cgv")),
                    btnCheckout = $(By.name("processCarrier"));

    public SelenideElement getCheckTermo() {
        return checkTermo;
    }

    public void setCheckTermo(SelenideElement checkTermo) {
        this.checkTermo = checkTermo;
    }

    public SelenideElement getBtnCheckout() {
        return btnCheckout;
    }

    public void setBtnCheckout(SelenideElement btnCheckout) {
        this.btnCheckout = btnCheckout;
    }

    public void aceitarTermo() {
        checkTermo.click();
    }

    public void fazerCheckout() {

        btnCheckout.click();
    }
}
