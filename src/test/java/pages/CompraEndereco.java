package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class CompraEndereco {
    private SelenideElement txtInfoAdicionais = $(By.name("message")),
                            btnChekout = $(By.name("processAddress"));

    public SelenideElement getTxtInfoAdicionais() {
        return txtInfoAdicionais;
    }

    public void setTxtInfoAdicionais(SelenideElement txtInfoAdicionais) {
        this.txtInfoAdicionais = txtInfoAdicionais;
    }

    public SelenideElement getBtnChekout() {
        return btnChekout;
    }

    public void setBtnChekout(SelenideElement btnChekout) {
        this.btnChekout = btnChekout;
    }

    public void informacoesAdicionais(String texto) {
        txtInfoAdicionais.scrollTo().setValue(texto);
    }

    public void fazerCheckout() {
        btnChekout.click();
    }
}
