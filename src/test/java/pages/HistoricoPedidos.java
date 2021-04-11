package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;



public class HistoricoPedidos {
    private ElementsCollection pedidos = $$(By.xpath("//table[@id=\"order-list\"]//tr[@class]"));

    public ElementsCollection getPedidos() {
        return pedidos;
    }

    public void setPedidos(ElementsCollection pedidos) {
        this.pedidos = pedidos;
    }

    public void validarQtPedidos(int qtPedidos) {
        pedidos.shouldHave(CollectionCondition.size(qtPedidos));

    }
}
