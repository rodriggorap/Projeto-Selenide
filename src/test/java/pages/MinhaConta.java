package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;

public class MinhaConta {

    private SelenideElement btnHistorico = $(By.linkText("ORDER HISTORY AND DETAILS")),
                            btnMeusCreditos = $(By.linkText("My credit slips")),
                            btnMeuEndereco = $(By.linkText("My addresses")),
                            btnInformacoespessoais = $(By.linkText("My personal information")),
                            btnMinhasListas = $(By.linkText("My wishlists")),
                            btnHome = $(By.linkText("Home")),
                            divTitulo = $(By.id("center_column")),
                            h1Titulo = $(By.className("page-heading"));

    public SelenideElement getBtnHistorico() {
        return btnHistorico;
    }

    public void setBtnHistorico(SelenideElement btnHistorico) {
        this.btnHistorico = btnHistorico;
    }

    public SelenideElement getBtnMeusCreditos() {
        return btnMeusCreditos;
    }

    public void setBtnMeusCreditos(SelenideElement btnMeusCreditos) {
        this.btnMeusCreditos = btnMeusCreditos;
    }

    public SelenideElement getBtnMeuEndereco() {
        return btnMeuEndereco;
    }

    public void setBtnMeuEndereco(SelenideElement btnMeuEndereco) {
        this.btnMeuEndereco = btnMeuEndereco;
    }

    public SelenideElement getBtnInformacoespessoais() {
        return btnInformacoespessoais;
    }

    public void setBtnInformacoespessoais(SelenideElement btnInformacoespessoais) {
        this.btnInformacoespessoais = btnInformacoespessoais;
    }

    public SelenideElement getBtnMinhasListas() {
        return btnMinhasListas;
    }

    public void setBtnMinhasListas(SelenideElement btnMinhasListas) {
        this.btnMinhasListas = btnMinhasListas;
    }

    public SelenideElement getBtnHome() {
        return btnHome;
    }

    public void setBtnHome(SelenideElement btnHome) {
        this.btnHome = btnHome;
    }

    public SelenideElement getDivTitulo() {
        return divTitulo;
    }

    public void setDivTitulo(SelenideElement divTitulo) {
        this.divTitulo = divTitulo;
    }

    public SelenideElement getH1Titulo() {
        return h1Titulo;
    }

    public void setH1Titulo(SelenideElement h1Titulo) {
        this.h1Titulo = h1Titulo;
    }

    public void voltarHome() {
        h1Titulo.should(Condition.text("My account"));
        btnHome.click();
    }

    public void historicoPedidos() {
        h1Titulo.should(Condition.text("My account"));
        btnHistorico.click();
    }
}



































