package comportamentais.templatemethod;

import java.math.BigDecimal;

public class DescontoPorItens extends Desconto {
    @Override
    public boolean deveAplicar(Pedido pedido) {
        return pedido.getQuantidadeItens() > 5;
    }

    @Override
    public BigDecimal calcular(Pedido pedido) {
        return pedido.getValorTotal().multiply(new BigDecimal("0.10"));
    }

    @Override
    public Desconto proximo() {
        return new DescontoPorValor();
    }
}
