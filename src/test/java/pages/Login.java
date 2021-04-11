package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;


public class Login {

    private SelenideElement inputEmailCriarConta = $(By.id("email_create")),
                            btnCriarConta = $(By.id("SubmitCreate")),
                            inputEmailLogin = $(By.id("email")),
                            inputSenha = $(By.id("passwd")),
                            btnSignin = $(By.id("SubmitLogin"));

    public SelenideElement getBtnSignin() {
        return btnSignin;
    }

    public void setBtnSignin(SelenideElement btnSignin) {
        this.btnSignin = btnSignin;
    }

    public SelenideElement getBtnCriarConta() {
        return btnCriarConta;
    }

    public void setBtnCriarConta(SelenideElement btnCriarConta) {
        this.btnCriarConta = btnCriarConta;
    }

    public SelenideElement getInputEmailLogin() {
        return inputEmailLogin;
    }

    public void setInputEmailLogin(SelenideElement inputEmailLogin) {
        this.inputEmailLogin = inputEmailLogin;
    }

    public SelenideElement getInputSenha() {
        return inputSenha;
    }

    public void setInputSenha(SelenideElement inputSenha) {
        this.inputSenha = inputSenha;
    }

    public SelenideElement getInputEmailCriarConta() {
        return inputEmailCriarConta;
    }

    public void setInputEmailCriarConta(SelenideElement inputEmailCriarConta) {
        this.inputEmailCriarConta = inputEmailCriarConta;
    }

    public SelenideElement getBntCriarConta() {
        return btnCriarConta;
    }

    public void setBntCriarConta(SelenideElement bntCriarConta) {
        this.btnCriarConta = bntCriarConta;
    }

    public void iniciarCadastro(String email) {
        inputEmailCriarConta.setValue(email);

    }

    public void btnCriarConta() {
        btnCriarConta.click();
    }

    public void fazerLogin(String email, String senha) {
        inputEmailLogin.setValue(email);
        inputSenha.setValue(senha);
        btnSignin.click();
    }
}
