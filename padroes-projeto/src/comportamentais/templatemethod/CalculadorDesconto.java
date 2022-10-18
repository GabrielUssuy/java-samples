package comportamentais.templatemethod;

import java.math.BigDecimal;

public class CalculadorDesconto {
    public BigDecimal calcular(Pedido pedido) {
        return new DescontoPorItens().calcular(pedido);
    }
}
