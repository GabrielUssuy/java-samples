package comportamentais.chainofresponsability;

import java.math.BigDecimal;

public class DescontoPorValor implements Desconto {
    @Override
    public BigDecimal calcular(Pedido pedido) {
        if(pedido.getValorTotal().compareTo(new BigDecimal("500")) > 0) {
            return pedido.getValorTotal().multiply(new BigDecimal("0.20"));
        }
        return BigDecimal.ZERO;
    }
}
