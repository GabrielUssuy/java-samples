package comportamentais.chainofresponsability;

import java.math.BigDecimal;

public class DescontoPorItens implements Desconto {
    @Override
    public BigDecimal calcular(Pedido pedido) {
        if(pedido.getQuantidadeItens() > 5) {
            return pedido.getValorTotal().multiply(new BigDecimal("0.10"));
        }

        return new DescontoPorValor().calcular(pedido);
    }
}
