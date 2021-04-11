package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class Cadastro {

    private SelenideElement radioGenero = $(By.name("id_gender")),
            inputPrimeiroNome = $(By.id("customer_firstname")),
            inputSegundoNome = $(By.id("customer_lastname")),
            inputEmail = $(By.id("email")),
            inputSenha = $(By.id("passwd")),
            selectDiaNascimento = $(By.id("days")),
            selectMesNascimento = $(By.id("months")),
            selectAnoNascimento = $(By.id("years")),
            checkNoticias = $(By.id("newsletter")),
            checkOfertas = $(By.id("optin")),
            inputEndereco = $(By.id("address1")),
            inputEndereco2 = $(By.id("address2")),
            inputCidade = $(By.id("city")),
            selectEstado = $(By.id("id_state")),
            inputCep = $(By.id("postcode")),
            selectPais = $(By.id("uniform-id_state")),
            textInformacaoAdicional = $(By.id("uniform-id_country")),
            inputTelefoneCasa = $(By.id("phone")),
            inputTelefoneCelular = $(By.id("phone_mobile")),
            inputEmailAlternativo = $(By.id("alias")),
            btntRegistrar = $(By.id("submitAccount"));

    public SelenideElement getRadioGenero() {
        return radioGenero;
    }

    public void setRadioGenero(SelenideElement radioGenero) {
        this.radioGenero = radioGenero;
    }

    public SelenideElement getInputPrimeiroNome() {
        return inputPrimeiroNome;
    }

    public void setInputPrimeiroNome(SelenideElement inputPrimeiroNome) {
        this.inputPrimeiroNome = inputPrimeiroNome;
    }

    public SelenideElement getInputSegundoNome() {
        return inputSegundoNome;
    }

    public void setInputSegundoNome(SelenideElement inputSegundoNome) {
        this.inputSegundoNome = inputSegundoNome;
    }

    public SelenideElement getInputEmail() {
        return inputEmail;
    }

    public void setInputEmail(SelenideElement inputEmail) {
        this.inputEmail = inputEmail;
    }

    public SelenideElement getInputSenha() {
        return inputSenha;
    }

    public void setInputSenha(SelenideElement inputSenha) {
        this.inputSenha = inputSenha;
    }

    public SelenideElement getSelectDiaNascimento() {
        return selectDiaNascimento;
    }

    public void setSelectDiaNascimento(SelenideElement selectDiaNascimento) {
        this.selectDiaNascimento = selectDiaNascimento;
    }

    public SelenideElement getSelectMesNascimento() {
        return selectMesNascimento;
    }

    public void setSelectMesNascimento(SelenideElement selectMesNascimento) {
        this.selectMesNascimento = selectMesNascimento;
    }

    public SelenideElement getSelectAnoNascimento() {
        return selectAnoNascimento;
    }

    public void setSelectAnoNascimento(SelenideElement selectAnoNascimento) {
        this.selectAnoNascimento = selectAnoNascimento;
    }

    public SelenideElement getCheckNoticias() {
        return checkNoticias;
    }

    public void setCheckNoticias(SelenideElement checkNoticias) {
        this.checkNoticias = checkNoticias;
    }

    public SelenideElement getCheckOfertas() {
        return checkOfertas;
    }

    public void setCheckOfertas(SelenideElement checkOfertas) {
        this.checkOfertas = checkOfertas;
    }

    public SelenideElement getInputEndereco() {
        return inputEndereco;
    }

    public void setInputEndereco(SelenideElement inputEndereco) {
        this.inputEndereco = inputEndereco;
    }

    public SelenideElement getInputEndereco2() {
        return inputEndereco2;
    }

    public void setInputEndereco2(SelenideElement inputEndereco2) {
        this.inputEndereco2 = inputEndereco2;
    }

    public SelenideElement getInputCidade() {
        return inputCidade;
    }

    public void setInputCidade(SelenideElement inputCidade) {
        this.inputCidade = inputCidade;
    }

    public SelenideElement getSelectEstado() {
        return selectEstado;
    }

    public void setSelectEstado(SelenideElement selectEstado) {
        this.selectEstado = selectEstado;
    }

    public SelenideElement getInputCep() {
        return inputCep;
    }

    public void setInputCep(SelenideElement inputCep) {
        this.inputCep = inputCep;
    }

    public SelenideElement getSelectPais() {
        return selectPais;
    }

    public void setSelectPais(SelenideElement selectPais) {
        this.selectPais = selectPais;
    }

    public SelenideElement getTextInformacaoAdicional() {
        return textInformacaoAdicional;
    }

    public void setTextInformacaoAdicional(SelenideElement textInformacaoAdicional) {
        this.textInformacaoAdicional = textInformacaoAdicional;
    }

    public SelenideElement getInputTelefoneCasa() {
        return inputTelefoneCasa;
    }

    public void setInputTelefoneCasa(SelenideElement inputTelefoneCasa) {
        this.inputTelefoneCasa = inputTelefoneCasa;
    }

    public SelenideElement getInputTelefoneCelular() {
        return inputTelefoneCelular;
    }

    public void setInputTelefoneCelular(SelenideElement inputTelefoneCelular) {
        this.inputTelefoneCelular = inputTelefoneCelular;
    }

    public SelenideElement getInputEmailAlternativo() {
        return inputEmailAlternativo;
    }

    public void setInputEmailAlternativo(SelenideElement inputEmailAlternativo) {
        this.inputEmailAlternativo = inputEmailAlternativo;
    }

    public SelenideElement getBtntRegistrar() {
        return btntRegistrar;
    }

    public void setBtntRegistrar(SelenideElement btntRegistrar) {
        this.btntRegistrar = btntRegistrar;
    }

    public void preencherCadastro(String genero, String primeiroNome, String segundoNome,
                                  String email, String senha, String diaNascimento, String mesNascimento, String anoNascimento,
                                  String ofertas, String noticias, String endereco, String cidade, String estado, String cep,
                                  String contatoCelular, String emailAlternativo) {

        if (genero.equalsIgnoreCase("masculino")) {
            radioGenero.selectRadio("1");
        } else {
            radioGenero.selectRadio("2");
        }

        inputPrimeiroNome.setValue(primeiroNome);
        inputSegundoNome.setValue(segundoNome);
        inputEmail.setValue(email);
        inputSenha.setValue(senha);
        selectDiaNascimento.selectOptionByValue(diaNascimento);
        selectMesNascimento.selectOptionByValue(mesNascimento);
        selectAnoNascimento.selectOptionByValue(anoNascimento);

        if (ofertas.equalsIgnoreCase("sim")) {
            checkOfertas.click();
        } /*else {
            checkOfertas.setSelected(false);
        }*/

        if (noticias.equalsIgnoreCase("sim")) {
            checkNoticias.click();
        } /*else {
            checkNoticias.setSelected(false);
        }*/

        inputEndereco.setValue(endereco);
        inputCidade.setValue(cidade);
        selectEstado.selectOption(estado);
        inputCep.setValue(cep);
        inputTelefoneCelular.setValue(contatoCelular);
        inputEmailAlternativo.setValue(emailAlternativo);

    }

    public void confirmaCadastro() {
        btntRegistrar.click();
    }

}




































