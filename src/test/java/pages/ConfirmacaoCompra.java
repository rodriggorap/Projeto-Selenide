package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class ConfirmacaoCompra {
    private SelenideElement confirmacao = $(By.id("center_column"));

    public SelenideElement getConfirmacao() {

        return confirmacao;
    }

    public void setConfirmacao(SelenideElement confirmacao) {
        this.confirmacao = confirmacao;
    }

    public void confirmacao() {
        confirmacao.shouldHave(Condition.appear);
    }
}
