package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;

public class DetalhesProduto {
    private SelenideElement btnAddCarrinho = $(By.id("add_to_cart")),
                            btnCheckOut = $(By.linkText("Proceed to checkout"));

    public SelenideElement getBtnAddCarrinho() {

        return btnAddCarrinho;
    }

    public void setBtnAddCarrinho(SelenideElement btnAddCarrinho) {

        this.btnAddCarrinho = btnAddCarrinho;
    }

    public void addCarinho() {

        btnAddCarrinho.click();
    }

    public void fazerCheckOut() {
        btnCheckOut.click();

    }

}
