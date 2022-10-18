package estruturais.proxy;

import java.math.BigDecimal;

public class TesteProxy {
    public static void main(String[] args) {
        OrcamentoProxy orcamentoProxy = new OrcamentoProxy(new Orcamento(BigDecimal.TEN));
        System.out.println(orcamentoProxy.getValor());
    }
}
