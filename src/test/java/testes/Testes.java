package testes;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import pages.*;
import static com.codeborne.selenide.Selenide.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Testes {

    Home home = new Home();
    Cadastro cadastro = new Cadastro();
    CompraEndereco compraEndereco = new CompraEndereco();
    CompraEnvio compraEnvio = new CompraEnvio();
    ConfirmacaoCompra confirmacaoCompra = new ConfirmacaoCompra();
    ConfirmarCompra confirmarCompra = new ConfirmarCompra();
    DetalhesProduto detalhesProduto = new DetalhesProduto();
    Login login = new Login();
    MinhaConta minhaConta = new MinhaConta();
    Pagamento pagamento = new Pagamento();
    ResultadoBusca resultadoBusca = new ResultadoBusca();
    ResumoCompra resumoCompra = new ResumoCompra();
    HistoricoPedidos historicoPedidos = new HistoricoPedidos();

    @Before
    public void configuracao(){
        Configuration.startMaximized = true;
        Configuration.timeout = 8000;

        open("http://automationpractice.com/");

    }
    @Ignore
    @Test
    public void criarConta() {
        home.sigIn();
        login.iniciarCadastro("rodrigoteste30@gmail.com");
        login.btnCriarConta();
        cadastro.preencherCadastro("masculino","Rodrigo","Pereira","rodrigoteste30@gmail.com",
                "123456","5","11","1975","sim","nao",
                "quadra 04 conjunto B casa 03","guara","Alabama","56524","61856235477","teste@gmail.com");
        cadastro.confirmaCadastro();
        minhaConta.getH1Titulo().shouldHave(Condition.text("My Account"));

    }

    @Test
    public void buscarProduto() {
        home.sigIn();
        login.fazerLogin("rodrigoteste30@gmail.com","123456");
        minhaConta.voltarHome();
        home.buscarProduto("t-shirts");
    }

    @Test
    public void fazerCompra() {
        resultadoBusca.escolherProduto("Printed Chiffon Dress");
        detalhesProduto.addCarinho();
        detalhesProduto.fazerCheckOut();
        resumoCompra.resumoSeguir();
        compraEndereco.informacoesAdicionais("Teste compra");
        compraEndereco.fazerCheckout();
        compraEnvio.aceitarTermo();
        compraEnvio.fazerCheckout();
        pagamento.tipoPagamento("banco");
        confirmarCompra.confirmarCompra();

        confirmacaoCompra.confirmacao();
    }

    @Test
    public void historicoDeCompras() {
        home.sigIn();
        login.fazerLogin("rodrigoteste30@gmail.com","123456");
        minhaConta.historicoPedidos();
        historicoPedidos.validarQtPedidos(1);

    }


}












