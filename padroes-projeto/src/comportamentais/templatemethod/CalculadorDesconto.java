package comportamentais.templatemethod;

import java.math.BigDecimal;

public class CalculadorDesconto implements Desconto {
    @Override
    public BigDecimal calcular(Pedido pedido) {
        return new DescontoPorItens().calcular(pedido);
    }
}
