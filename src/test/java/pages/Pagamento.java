package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;

public class Pagamento {
    private SelenideElement btnPagamentoBanco = $(byText("Pay by bank wire")),
                            btnPagamentoCheque = $(By.linkText("Pay by check"));

    public SelenideElement getBtnPagamentoBanco() {
        return btnPagamentoBanco;
    }

    public void setBtnPagamentoBanco(SelenideElement btnPagamentoBanco) {
        this.btnPagamentoBanco = btnPagamentoBanco;
    }

    public SelenideElement getBtnPagamentoCheque() {
        return btnPagamentoCheque;
    }

    public void setBtnPagamentoCheque(SelenideElement btnPagamentoCheque) {
        this.btnPagamentoCheque = btnPagamentoCheque;
    }

    public void tipoPagamento(String tipo) {
        if (tipo.equalsIgnoreCase("banco")){
            btnPagamentoBanco.click();
        }else{
            btnPagamentoCheque.click();
        }


    }
}

