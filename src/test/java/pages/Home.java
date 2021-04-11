package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;

public class Home {

    private SelenideElement inputBusca = $(By.id("search_query_top")),
                            btnBusca = $(By.name("submit_search")),
                            SigIn = $(By.linkText("Sign in"));


    public SelenideElement getInputBusca() {
        return inputBusca;
    }

    public void setInputBusca(SelenideElement inputBusca) {
        this.inputBusca = inputBusca;
    }

    public SelenideElement getBtnBusca() {
        return btnBusca;
    }

    public void setBtnBusca(SelenideElement btnBusca) {
        this.btnBusca = btnBusca;
    }

    public SelenideElement getSigIn() {
        return SigIn;
    }

    public void setSigIn(SelenideElement sigIn) {
        this.SigIn = sigIn;
    }

    public void sigIn() {
        SigIn.click();
    }

    public void buscarProduto(String produto) {
        inputBusca.setValue(produto);
        btnBusca.click();
    }

}





















